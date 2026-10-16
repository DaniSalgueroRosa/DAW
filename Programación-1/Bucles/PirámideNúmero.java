
import java.util.Scanner;

public class PirámideNúmero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int altura;
        int número;

        System.out.print("Introduzca la altura de la pirámide: ");
        altura = scanner.nextInt();

        for (int fila = 1; fila <= altura; fila++) {
            int simbolos = (fila * 2) - 1;
            int espacios = altura - fila;
        }

        
    }
}
// Dividir 