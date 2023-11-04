import java.util.Scanner;

public class Promedios {
    public static void main(String[] args) {
        // Definir datos para realizar la operación
            float dato1 = 0;
            float dato2 = 0;
            float dato3 = 0;
            float resultado = 0;
            float totaldatos = 3;

        //Definir objeto para lectura de datos
        Scanner lectura = new Scanner(System.in);

        // Solicitud del dato a procesar
        System.out.println("Ingresa el primer número: ");
        dato1 = lectura.nextFloat();

        System.out.println("Ingresa el segundo número: ");
        dato2 = lectura.nextFloat();

        System.out.println("Ingresa el tercer número: ");
        dato3 = lectura.nextFloat();

        //Operaciones
        totaldatos = dato1+dato2+dato3;
        resultado = totaldatos/3;

        // Salida del resultado
        System.out.println("El promedio es: " + resultado);

    }



}
