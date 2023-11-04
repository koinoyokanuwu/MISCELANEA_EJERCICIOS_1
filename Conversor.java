import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        // Definir datos para realizar la operación
        float EUR = 0;
        double USD = 0;


        //Definir objeto para lectura de datos
        Scanner lectura = new Scanner(System.in);

       //Definir valor base
        System.out.println("1 EUR = 1.06 USD");

        // Solicitud del dato a procesar

        System.out.println("Digita el valor en Euros: ");
        EUR = lectura.nextFloat();

        //Operación
        USD =(EUR*1.06);

        // Salida del resultado
        System.out.println("El valor en dólares es: "+ USD);
    }

}
