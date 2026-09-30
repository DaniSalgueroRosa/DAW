
import java.util.Scanner;

public class condicional {

    public static void main(String[] args) {
        double nota;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digame su nota: ");
        nota = scanner.nextDouble();
        if (nota < 5.0){
             System.out.println("Suspenso");
        }
        else if (nota>= 5.0 && nota < 7.0){
            System.out.println("Bien");
        }
        else{
            System.out.println("Sobresaliente");
        }
    }

}
