import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print(
                "Introduzca los números a continuación PULSANDO INTRO al introducir cada número y serán ordenados de menor a mayor:");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        if (a < b && b < c) {
            System.out.println("El orden de los números es:" + " " + a + ", " + b + " y " + c);
        } else if (a < c && c < b) {
            System.out.println("El orden de los números es:" + " " + a + ", " + c + " y " + b);
        } else if (b < a && a < c) {
            System.out.println("El orden de los números es:" + " " + b + ", " + a + " y " + c);
        } else if (b < c && c < a) {
            System.out.println("El orden de los números es:" + " " + b + ", " + c + " y " + a);
        } else if (c < a && a < b) {
            System.out.println("El orden de los números es:" + " " + c + ", " + a + " y " + b);
        } else if (c < b && b < a) {
            System.out.println("El orden de los números es:" + " " + c + ", " + b + " y " + a);
        } else {
            System.out.println("Hay números iguales. Por favor vuelva a introducirlos");
        }
    }
}