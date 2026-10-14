import java.util.Scanner;

public class Práctica1 {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String nombre;
    int edad;
    System.out.print("Introduzca su nombre: ");
    nombre = scanner.nextLine();
    System.out.print("Introduzca su edad: ");
    edad = scanner.nextInt();
    System.out.println("Hola "+ nombre + " tienes " + edad + " , disfruta de la vida.");
    
 }   
}
