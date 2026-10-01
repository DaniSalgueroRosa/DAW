
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) throws Exception {
        System.out.print("Porfavor introduzca su nombre: ");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        System.out.println("\nEncantado de conocerte, " + nombre);
        System.out.println("¿Que edad tienes?");
        int edad = scanner.nextInt();
        boolean serMayor = edad >= 18;
        System.out.println("¿Es mayor de edad? " + serMayor);
    }
}
