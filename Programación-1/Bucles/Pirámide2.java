
import java.util.Scanner;

public class Pirámide2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura;
        char relleno;

        System.out.print("Introduzca la que desea que sea la altura de su pirámide: ");
        altura = scanner.nextInt();
        System.out.print("Introduzca el carácter de relleno de su pirámide: ");
        relleno = scanner.next().charAt(0);

        for (int fila = 1; fila <= altura; fila++) {
            int simbolos = (fila * 2) - 1;
            int espacios = altura - fila;

            for (int columna = 1; columna <= espacios; columna++) {
                System.out.print(" ");
            }

            for (int columna = 1; columna <= simbolos; columna++) {
               if ( columna == 1 ||columna <= simbolos || fila == altura)
                System.out.print(relleno);
               else {
                System.out.print(" ");
               }
            }
            System.out.println(" ");

        }
    }
}

// HACERLO BIEN
