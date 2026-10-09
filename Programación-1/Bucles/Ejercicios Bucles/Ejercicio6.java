import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = 0;
        System.out.print("Introduzca los números que desee para hacer la media aritmetica para terminar debe introducir un número negativo: ");
        
        while(num<0){
            num = scanner.nextDouble();
        }
    }
}
