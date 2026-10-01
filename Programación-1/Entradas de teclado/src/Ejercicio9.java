
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Introduzca la cantidad de Kb que desea pasar a Mb: ");
    double kb = scanner.nextDouble();
    double mb = kb / 1024;
    System.out.println(""+ kb+ "son un total de " + mb + "Mb"); 

    }
}
