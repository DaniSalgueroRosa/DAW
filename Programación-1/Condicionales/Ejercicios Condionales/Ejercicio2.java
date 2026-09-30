
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hora;
        System.out.print("Por favor, introduzca una hora del día (0 - 23):");
        hora = scanner.nextInt();
        if (hora > 23) {
            System.out.println("Incorrecto");

        } else {
            if (hora >= 6 && hora <= 12) {
                System.out.println("Buenos días");
            }
            if (hora >= 13 && hora <= 20) {
                System.out.println("Buenas tardes");
            }
            if (hora > 20 || hora < 6) {
                System.out.println("Buenas noches");
            }

        }
    }
}
