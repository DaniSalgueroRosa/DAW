
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Este programa hace el cálculo de ecuaciones de segundo grado(ax2 + bx +c)");
        System.out.print("Introduzca la a: ");
        a = scanner.nextDouble();
        System.out.print("Introduzca la b: ");
        b = scanner.nextDouble();
        System.out.print("Introduzca la c: ");
        c = scanner.nextDouble();
        double b2;
        b2 = (b * b - 4 * a * c);
    
        if (b2 < 0) {
            System.out.println("La ecuación no tiene solucion real");
        }
        else if (a == 0 && b == 0 && c == 0) {
         System.out.println("La ecuación tiene infinitas soluciones");
         }
         else if (a==0 && b==0) {
            System.out.println("Esta ecuación no tiene solución");
         }
         else {
            double x1 = (-b + Math.sqrt(b2)) / (2 * a);
            double x2 = (-b - Math.sqrt(b2)) / (2 * a);

            System.out.println("La primera solución de la ecuación sería: x1= " + x1);
            System.out.println("La segunda solución de la ecuación sería: x2= " + x2); 
        
        }
     }
}
