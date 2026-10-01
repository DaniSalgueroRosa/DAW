
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca su nombre completo: ");
        String name = scanner.nextLine();
        System.out.print("Introduzca su dirección: ");
        String address = scanner.nextLine();
        System.out.print("Introduzca su número telefónico: ");
        Integer number = scanner.nextInt();
        System.out.println("\033[32m"+ name);
        System.out.println("\033[33m"+ address);
        System.out.println("\033[34m"+ number);
    }
}
