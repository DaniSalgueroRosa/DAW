
import java.util.Scanner;

public class switch1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota = 0;
        System.out.print("¿Que nota has sacado? ");
        nota = scanner.nextInt();

        switch (nota) {
            case 5: {
                System.out.println("Aprobado");
                break;
            }
            case 6: {
                System.out.println("Bien");
            }
            case 7:
            case 8: {
                System.out.println("Notable");
                break;
            }
            case 9:
            case 10: {
                System.out.println("Sobresaliente");
                break;
            }
            default:
                if (nota<5){
                System.out.println("Suspenso");
        }
        else{
            System.out.println("No puede ser mayor de 10");
        }
        
        }
    }
}
