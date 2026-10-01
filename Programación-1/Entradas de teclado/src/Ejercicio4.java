
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de euros que desea ver en pesetas: ");
        int euros = scanner.nextInt();
        int pesetas = euros * 166;
        System.out.println("" + euros + " " + "euros son un total de " + pesetas + " pesetas");
    }
}
