
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("¿Cual es tu primer apellido? ");
        String apellido1 = scanner.nextLine();
        System.out.print("¿Cual es tu segundo apellido? ");
        String apellido2 = scanner.nextLine();
        System.out.print("" + apellido1 + " " + apellido2 + ", " + nombre);
    }
}
