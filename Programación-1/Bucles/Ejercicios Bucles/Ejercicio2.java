
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int posiciones = 0;
        System.out.print("Dime un número entero mayor o igual a 2: ");
        posiciones = scanner.nextInt();
        int valorMenos2 = 0;
        int valorMenos1 = 1;
        int valorActual = 0;
        int indice = 2;
        if (posiciones >= 2) {
            System.out.print(valorMenos2 + "," + valorMenos1 + ",");
        }
        while (indice < posiciones) {
            valorActual = valorMenos1 + valorMenos2;
            valorMenos2 = valorMenos1;
            valorMenos1 = valorActual;
            System.out.print(valorActual + " , ");
            indice++;
        }
    }
}
