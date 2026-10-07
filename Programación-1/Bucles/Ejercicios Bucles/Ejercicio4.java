
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int multiplicación = 0;
        
        System.out.print("Introduzca un número: ");
        num = scanner.nextInt();
        
        while (multiplicación <= 10) {
            int resultado = num * multiplicación;
            System.out.println(num + " x " + multiplicación + " = " + resultado);

            multiplicación++;

        }
        if (num >= 11){
            System.out.println("El número debe ser menor o igual a 10");
        }
    }
}
