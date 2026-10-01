import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int numa;
        int numd;
        System.out.print("Por favor, introduzca un número entero positivo (de 5 cifras como máximo): ");
        num = scanner.nextInt();
        numa = num % 10;

        if (num < 0 || num > 99999) {
            System.out.println("El número debe ser positivo");
        } else if (num < 10) {
            numd = num;
            if (numd == numa) {
                System.out.println("El número es capicúa");
            } else {
                System.out.println("El número no es capicúa");
            }
        } else if (num < 100) {
            numd = num / 10;
            if (numd == numa) {
                System.out.println("El número es capicúa");
            } else {
                System.out.println("El número no es capicúa");
            }
        } else if (num < 1000) {
            numd = num / 100;
            if (numd == numa) {
                System.out.println("El número es capicúa");
            } else {
                System.out.println("El número no es capicúa");
            }
        } else if (num < 10000) {
            numd = num / 1000;
            if (numd == numa) {
                System.out.println("El número es capicúa");
            } else {
                System.out.println("El número no es capicúa");
            }
        } else if (num > 10000) {
            numd = num / 10000;
            if (numd == numa) {
                System.out.println("El número es capicúa");
            } else {
                System.out.println("El número no es capicúa");
            }
        }

    }
}
