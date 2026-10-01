
/* 
Escribe un programa que calcule la nota que hace falta sacar en el segundo examen de "Programación" para obtener la nota deseada. 
La nota del primer examen cuenta un 40% y la del segundo un 60%

Introduzca la nota del primer examen: 7
¿Qué nota quiere sacar en el trimestre? 8.5
Para obtener un 8.5 en el trimestre debe sacar un 9.5 en el segundo examen
 */


import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        
        System.out.print("Introduzca la nota del primer examen:");
        double nota1 = scanner.nextDouble();
         System.out.print("Introduzca la nota que desea sacar en el trimestre:");
        double notatris = scanner.nextDouble();
        double nota2= (notatris - 0.4 * nota1 )/0.6;
        System.out.println("Para obtener un" + " " + notatris + " " + "en el trimestre debe sacar un"+ " " + nota2 + " " +"en el segundo examen");

        
        

    }
}
