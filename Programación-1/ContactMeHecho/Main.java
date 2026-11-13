import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Agenda agenda = new Agenda(20);
        int option = 0;
        do { 
            try {
                System.out.println("==================");
                System.out.println("ContactMe:");
                System.out.println("==================");
                System.out.println("1. Añadir contacto");
                System.out.println("2. Mostrar agenda");
                System.out.println("3. Salir");
                System.out.print("Elige una opción:");
                option = scanner.nextInt();
            } catch (InputMismatchException _) {
                System.out.println("No es un número");
                scanner.next();
            }
        } while (option!=3);
    }
}
