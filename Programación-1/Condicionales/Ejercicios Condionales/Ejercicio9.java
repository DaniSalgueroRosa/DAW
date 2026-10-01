import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int ultimo;
    System.out.print("Por favor, introduzca un número entero: ");
    num = scanner.nextInt();
    ultimo = num%10;
    System.out.println("La última cifra de su número es: " + ultimo);
    }
}
