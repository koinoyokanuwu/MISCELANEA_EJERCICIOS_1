// Importar clase para leer desde consola
import java.util.Scanner;

public class areaTriangulo {
    public static void main(String[] args) {
        //Definición de datos para calcular el área de un triángulo
        float base = 0;
        float altura = 0;
        float area = 0;

        // Creación del objeto para la lectura de la consola.
        Scanner lectura = new Scanner(System.in);

        //Ingresar la base
        System.out.println("Digite la base: ");
        base = lectura.nextFloat();

        //Ingresar la altura
        System.out.println("Digite la base: ");
        altura = lectura.nextFloat();

        //Realizar el cálculo
        area = (base * altura) / 2;

        //Resultado
        System.out.println("El área del triángulo es: " + area);
    }
}
