
import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        boolean esPrimo = true;

        System.out.print("Introduce un número entero y te diré si es primo: ");
        num = scanner.nextInt();

        if (num <= 1) {
            esPrimo = false;
            System.out.println("El número no es primo");
        } else {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    System.out.println("El número no es primo");
                }
            }
        }
        if(esPrimo){
            System.out.println("El número es primo");
        }
    }
}
