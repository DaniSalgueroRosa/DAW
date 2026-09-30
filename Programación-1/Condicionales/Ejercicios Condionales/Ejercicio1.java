
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int dia;
        String dia1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, introduzca un día de la semana y le diré qué asignatura toca a primera hora ese día:");
       // dia = scanner.nextInt();
        dia1 = scanner.nextLine();

       /*  switch (dia) {

            case 1: {
                System.out.print("IPE 1");
                break;
            }
            case 2:
            case 3: {
                System.out.print("Entornos de Desarrollo");
                break;
            }
            case 4: {
                System.out.print("Base de Datos");
                break;
            }
            case 5: {
                System.out.print("Sistemas Informáticos");
                break;
            }
            default:
                System.out.print("Día Incorrecto");
                break;
        } */
        switch (dia1) {

            case "Lunes": {
                System.out.print("IPE 1");
                break;
            }
            case "Martes", "Miercoles": {
                System.out.print("Entornos de Desarrollo");
                break;
            }
            case "Jueves": {
                System.out.print("Base de Datos");
                break;
            }
            case "Viernes": {
                System.out.print("Sistemas Informáticos");
                break;
            }
            default:
                System.out.print("Día Incorrecto");
                break;
        }

    }
}
