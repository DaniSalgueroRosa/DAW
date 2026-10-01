import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero (5 cifras como máximo): ");
        num = scanner.nextInt();
        if (num < 10) {
            System.out.println("El número tiene un dígito");
        } else if (num >= 10 && num < 100) {
            System.out.println("El número tiene 2 dígitos");
        } else if (num >= 100 && num < 1000) {
            System.out.println("El número tiene 3 dígitos");
        } else if (num >= 1000 && num < 10000) {
            System.out.println("El número tiene 4 dígitos");
        } else if (num >= 10000 && num < 100000) {
            System.out.println("El número tiene 5 dígitos");
        } else {
            System.out.println("El número es mayor de 5 dígitos. Introduzca otro número menor");
        }
    }
}
