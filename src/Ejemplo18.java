import java.util.Scanner;
public class Ejemplo18 {
    public static void main(String[] args) {

        int horas;
        float precio;
        float bruto;
        float impuestos;


        Scanner inputValue = new Scanner(System.in);
        System.out.println("Precio por hora?");
        precio = inputValue.nextFloat();

        System.out.println("Numero de horas trabajadas?");
        horas = inputValue.nextInt();

        inputValue.close();


        //// PRIMERO CALCULAMOS PAGO BRUTO /////
        if (horas <= 35){
            bruto = horas * precio;
        }else{
            /// LAS PRIMERAS 35H SE PAGAN AL PRECIO NORMAL ///
            bruto = precio * 35;
            //// LAS SIGUIENTES SE PAGAN A 1,5 VECES EL PRECIO NORMAL ////
            bruto += (horas - 35) * precio * 1.5;
        }

        if (bruto <= 500){
            impuestos = 0;
        }else if (bruto <= 900){
            impuestos = ( bruto - 500) * 0.25f;
        }else {
            impuestos = (400 - 0.25f) * (bruto - 400 - 500) * 0.45f;
        }

        System.out.println("Pago bruto: " + bruto);
        System.out.println("Salario neto: " + (bruto - impuestos));
        System.out.println("Impuestos: " + impuestos);



    }
}