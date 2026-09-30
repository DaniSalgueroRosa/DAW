
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.print("¿Cuál desea que sea la x? ");
        Scanner scanner = new Scanner(System.in);
        Float valorx = scanner.nextFloat();
        System.out.print("¿Cuál desea que sea la y? ");
        Float valory = scanner.nextFloat();
        Float x = valorx;
        Float y = valory;
        float suma;
        Float resta;
        Float multiplicación;
        Float división;

        suma = x + y;
        resta = x - y;
        multiplicación = x * y;
        división =  x / y;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicación);
        System.out.println("El resultado de la división es: " + división);

        Float resultadoreal = (Float) x / y;
        System.out.printf("x + y = %.2f\n", x + y);
        System.out.printf("x - y = %.2f\n", x - y);
        System.out.printf("x * y = %.2f\n", x * y);
        System.out.printf("x / y = %.8f\n", resultadoreal);

        scanner.close();
    }
}
