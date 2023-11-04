import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class numeroCuadrado {
    public static void main(String[] args) {
        //Definir datos para realizar la operación
        double entero = 0;
        double resultado = 0;


        //Objeto para lectura de datos
        Scanner lectura = new Scanner(System.in);

        //Solicitar al usuario número a potenciar
        System.out.println("Digite el número a elevar: ");
        entero = lectura.nextDouble();

        //Operación
        resultado = (entero * entero);

        // Salida del resultado
        System.out.println("El valor total es: " + resultado);
    }
}





















