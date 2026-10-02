
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero (5 cifras como máximo): ");
        num = scanner.nextInt();
        if (num < 0) {
            num = num * -1;

        }
        if (num > 0  && num < 10) {
            System.out.println("El número tiene 1 dígito");
        }
        if (num >= 10 && num < 100) {
            System.out.println("El número tiene 2 dígitos");
        }
        if (num >= 100 && num < 1000) {
            System.out.println("El número tiene 3 dígitos");
        }
        if (num >= 1000 && num < 10000) {
            System.out.println("El número tiene 4 dígitos");
        }
        if (num >= 10000 && num < 100000) {
            System.out.println("El número tiene 5 dígitos");
        }

    }
}
