import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {
        // Definir datos para realizar la operación
        float lado = 0;
        double area = 0;
        double perimetro = 0;

        //Definir objeto para lectura de datos
        Scanner lectura = new Scanner(System.in);

        // Solicitud del dato a procesar
        System.out.println("Ingresa la medida del lado del cuadrado: ");
        lado = lectura.nextFloat();

        //Operaciones
        area = (lado*2);
        perimetro = (lado*4);

        // Salida del resultado
        System.out.println("El área del cuadrado es: "+ area);
        System.out.println("El perímetro del cuadrado es: "+ perimetro);
    }
}
