
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int password = 1910;
        int password1;
        int trys = 4;
        int contador = 0;

        do {
            System.out.print("Introduzca la contraseña: ");
            password1 = scanner.nextInt();
            if (password1 == password) {
                contador = trys;
                contador++;
                System.out.println("Has abierto la caja fuerte");
            } else {
                System.out.println("Error! Vuelva a intentarlo ");
                contador++;
            }

        } while (contador < 4);
        if (password1 != password) {
            System.out.println("Se ha quedado sin intentos");
        }
    }
}
