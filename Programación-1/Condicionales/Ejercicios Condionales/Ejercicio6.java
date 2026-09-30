
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    double a;
    double b;
    double c;
    System.out.println("Este programa hace el cálculo de ecuaciones de segundo grado");
    System.out.print("Introduzca la a: ");
    a = scanner.nextDouble();
    System.out.print("Introduzca la b: ");
    b = scanner.nextDouble();
    System.out.print("Introduzca la c: ");
    c = scanner.nextDouble();
    double b2;
    b2 = (b*b -4*a*c);
    if (b2 < 0) {
        System.out.println("La ecuación no tiene solucion");
    
    }else{
        double x1 = (-b + Math.sqrt(b*b -4*a*c))/2*a;
        double x2 = (-b - Math.sqrt(b*b -4*a*c))/2*a;
     
        System.out.println(""+ x1 );
        System.out.println(""+ x2);
    }
}
}
