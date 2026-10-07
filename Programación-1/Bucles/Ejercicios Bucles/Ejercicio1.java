
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        System.out.print("Introduzca un número natural mayor que 0: ");
        numero = scanner.nextInt();
        int suma = 0;
        /*int indice = 0;

        
        while (indice <= numero) {
            suma = suma + indice;
            indice++;
            
        }*/
        if (numero > 0) {

            for (int indice = 1; indice <= numero; indice++) {
                suma = suma + indice;

            }
            System.out.printf("La suma desde 0 hasta %d es %d", numero, suma);

        } else {
            System.out.println("El número introducido no es natural");
        }
    }
}
