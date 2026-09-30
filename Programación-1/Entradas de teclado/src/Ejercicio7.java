
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca la medida de su primer lado en cm: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Introduzca la medida de su segundo lado en cm: ");
        double lado2 = scanner.nextDouble();
        double area = lado1 * lado2;
        System.out.print("El área de su rectángulo es " + area + "cm²");
    }
}
