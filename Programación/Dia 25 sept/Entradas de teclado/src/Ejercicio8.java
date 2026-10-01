
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca la áltura de su triángulo en cm: ");
        double altura = scanner.nextDouble();
        System.out.print("Introduzca la base de su triángulo en cm: ");
        double base = scanner.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("El área de este triángulo es: " + area + "cm²");
    }
}
