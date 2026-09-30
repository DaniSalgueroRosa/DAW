
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de pesetas que desea ver en euros: ");
        int pesetas = scanner.nextInt();
        double euros = pesetas * 0.006;
        System.out.println("" + pesetas + " " + "pesetas son un total de " + euros + " euros");
    }
}
