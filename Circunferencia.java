import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {
        // Definir datos para realizar la operación
        double radio = 0;
        double pi = 3.1416;
        double area = 0;
        double longitud = 0;

        //Definir objeto para lectura de datos
        Scanner lectura = new Scanner(System.in);

        // Solicitud del dato a procesar
        System.out.println("Ingresa la medida del radio de la circunferencia: ");
        radio = lectura.nextDouble();

        //Operaciones
        area = pi * (radio*radio);
        longitud = 2 * pi * radio;


        // Salida del resultado
        System.out.println("El área del círculo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitud);
    }
}



