
import java.util.Scanner;

public class Ejercicio3Bien {
    public static void main(String[] args) {
        
        final int locakPassword = 1234;
        int guessedPassword = 0;
        int attemps = 0;
        boolean isPasswordCorrect = false;

        Scanner scanner = new Scanner(System.in);

        do { 
            attemps++;
            System.out.print("Enter the password: ");
            guessedPassword = scanner.nextInt();
            isPasswordCorrect = locakPassword == guessedPassword;
            if(!isPasswordCorrect){
                System.out.println("Incorrect password");
            }
            

        } while (!isPasswordCorrect && attemps<4);
        if (!isPasswordCorrect) {
             System.out.println("No more password attemps, lock is closer");
        }else {
            System.out.println("Lock is open, get your jewels");

        }
    }
}
