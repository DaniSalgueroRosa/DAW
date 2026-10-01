
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a; 
        double b;
        double x;

        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Por favor, introduzca el valor de a: ");
        a = scanner.nextDouble();
        System.out.print("Por favor, introduzca el valor de b: ");
        b = scanner.nextDouble();
        x = -b/a;
        System.out.println("El resultado de la ecuación es" + x);
    
    }
}
