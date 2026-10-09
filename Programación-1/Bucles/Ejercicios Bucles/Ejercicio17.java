import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int suma = 0;

        System.out.print("Introduzca un número entero positivo: ");
        num = scanner.nextInt();

        if(num>0){
            for (int i = num; i < num + 100; i++) {
                suma = suma + i;
            }
        }else{
            System.out.println("Su número debe ser positivo");
            
        }
        if(num>0){
            System.out.println("La suma de los cien siguientes números es: " + suma);
    }
}
}