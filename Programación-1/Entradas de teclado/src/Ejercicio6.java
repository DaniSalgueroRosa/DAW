
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca la base imponible: ");
        double BasImp = scanner.nextDouble();
        double iva = BasImp * 0.21;
        double total = BasImp + iva;
        System.out.println("Base Imponible:" + BasImp + "" + "Euros");
        System.out.println("Iva: " + iva + "" + "Euros");
        System.out.println("-----------------------------");
        System.out.println("Total:" + total + " " + " Euros");
    }
}
