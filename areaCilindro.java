import java.util.Scanner;

public class areaCilindro {

    public static void main(String[] args) {
        // Definir datos para realizar la operación
        double pi = 3.1416;
        double radio = 0;
        double altura = 0;
        double area = 0;
        double volumen = 0;
        //Definir objeto para lectura de datos
        Scanner lectura = new Scanner(System.in);

        // Solicitud del dato a procesar
        System.out.println("Ingresa la medida del radio de la circunferencia: ");
        radio = lectura.nextDouble();

        System.out.println("Ingresa la altura del cilindro: ");
        altura = lectura.nextDouble();

        //Operaciones
        volumen = 2 * pi * radio * (altura + radio);
        area = ((pi * pi) * radio * altura) + ((pi * pi) * (radio * radio));

        // Salida del resultado
        System.out.println("El área del cilindro es: "+ area);
        System.out.println("El volumen del cuadrado es: "+ volumen);

    }
}
