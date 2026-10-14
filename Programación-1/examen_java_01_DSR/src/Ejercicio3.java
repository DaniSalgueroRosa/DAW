
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int segundos = 0;

        System.out.print("Introduzca una cantidad de segundos: ");
        segundos = scanner.nextInt();
        int horas = segundos / 3600;
        int minutos = (segundos / 60) - horas*60 ;
        int segundos2 = segundos - horas*3600 - minutos*60  ;

        System.out.printf("%d segundos son \033[43m%d horas\033[0m, \033[41m\033[37m%d minutos \033[0my \033[0m\033[42m%d segundos\033[0m.", segundos, horas, minutos, segundos2);

    }
}
