
import java.util.Scanner;

public class Excepciones { // manera de manejar errores
   public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
   
    int num;
    System.out.print("Introduzca un número: ");
    if (!scanner.hasNextInt()){
        System.out.println("Error, meta un entero");

    
    }try
    catch
    finally {
        scanner.close();}
   } 
}
