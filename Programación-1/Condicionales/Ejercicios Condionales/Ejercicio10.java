import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int num1;
        System.out.print("Por favor, introduzca un número entero positivo (de 5 cifras como máximo): ");
        num = scanner.nextInt();
        if (num < 0 || num > 99999) {
            System.out.println("El número debe ser positivo");
        } else if (num < 10) {
            num1 = num;
            System.out.println("La primera cifra de " + num + "es:" + num1);
        } else if (num < 100) {
            num1 = num / 10;
            System.out.println("La primera cifra de " + num + "es:" + num1);
        } else if (num < 1000) {
            num1 = num / 100;
            System.out.println("La primera cifra de " + num + "es:" + num1);
        } else if (num < 10000) {
            num1 = num / 1000;
            System.out.println("La primera cifra de " + num + "es:" + num1);
        } else if (num > 10000) {
            num1 = num/10000;
            System.out.println("La primera cifra de " + num + " es: " + num1);
        }
        
    }
    }

