import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = 0;
        int dig = 0;
    
        System.out.print("Introduzca un número  para saber cuantos dígitos tiene: ");
        num = scanner.nextLong();

        if (num<0) {
            num = num *-1;
        
        }while (num > 0) {
            num = num/10;
            dig++;
        }
        System.out.println("El número tiene "+dig +  " dígitos");
    }
}
