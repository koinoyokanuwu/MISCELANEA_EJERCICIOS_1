import java.util.Scanner;
public class Suma {
    public static void main(String[] args) {
        // Definir datos para realizar la operación
        float a = 0;
        float b = 0;
        float resultado = 0;

        // Objeto para lectura de datos
        Scanner lectura = new Scanner(System.in);

        // Solicitud del primer dato
        System.out.println("Ingrese el primer número a sumar: ");
        a = lectura.nextFloat();

        //Solicitud del segundo dato
        System.out.println("Ingrese el segundo número a sumar: ");
        b = lectura.nextFloat();

        //Cálculo del resultado
        resultado = a + b;

        // Salida del resultado
        System.out.println("El valor total es: " + resultado);
    }
}
