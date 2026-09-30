
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t;
        System.out.println("Cálculo del tiempo de caída de un objeto.");
        System.out.print("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
        double h = scanner.nextDouble();
        if (h < 0) {
            System.out.println("La altura no puede ser negativa");
        } else if (h > 0) {
            t = Math.sqrt(2 * h / 9.81);
            System.out.printf("El tiempo que tarda en caer el objeto es %.2f s", t);

        }
    }

}
