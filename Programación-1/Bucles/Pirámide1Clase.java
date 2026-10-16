
import java.util.Scanner;

public class Pirámide1Clase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int altura;
        char relleno;
      

        System.out.print("Dime la altura que quieres que tenga la piramide");
        altura = scanner.nextInt();

        for (int fila = 1; fila <= altura; fila++) {
            int simbolos = (fila * 2) - 1;
            int espacios = altura - fila;

            for (int columna = 1; columna <= espacios; columna++) {
                System.out.print(" ");
            }

            for (int columna = 1; columna <= simbolos; columna++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

}
