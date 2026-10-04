import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hora; 
        int minutos;
        System.out.print("A continuación deberá introducir una hora del día, primero introducirá la hora y luego los minutos:");
        hora = scanner.nextInt();
        minutos= scanner.nextInt();
       if (hora>24){
        System.out.println("La hora no puede ser mayor de las 24");
       }
       else if (minutos == 0){
         int calculo= (24-hora)*3600;
        System.out.println("El tiempo restante hasta la medianoche es "+ calculo + " segundos");
       } 
        else if (minutos>0 && hora>0){
         int calculo= (23-hora)*3600 + (60-minutos)*60;
        System.out.println("El tiempo restante hasta la medianoche es "+ calculo + " segundos");
       } 
       else if (minutos>0 && hora==0){
         int calculo= (60-minutos)*60;
        System.out.println("El tiempo restante hasta la medianoche es "+ calculo + " segundos");
       } 
    }
}
