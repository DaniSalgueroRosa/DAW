
import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        /*  private static int leerNaturalSeguro(){
        Scanner scanner = new Scanner (System.in);
        int natural = 0
        } */

        Scanner scanner = new Scanner(System.in);
        int opcion;
        int entradaAdulto;
        int entradaNinio;
        int audioguia;
        do {
            Caja caja1 = new Caja();
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar ticket");
            System.out.println("2. Resumen ventas");
            System.out.println("3. Salir de la aplicación");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Número de entradas de adulto: ");
                    entradaAdulto = scanner.nextInt();
                    System.out.print("Número de entradas de niño: ");
                    entradaNinio = scanner.nextInt();
                    System.out.print("Número de audioguías: ");
                    audioguia = scanner.nextInt();
                    Ticket ticket = new Ticket(entradaAdulto, entradaNinio, audioguia);
                    ticket.imprimirTicket();
                    Caja.registrarTicket(ticket);
                    break;
                case 2:
                    Caja.mostrarResumenDia();
                    
                    break;
                case 3:
                     System.out.println("Hasta luego");
                     break;

                default: 
                    System.out.println("Ha introducido " + opcion + ". Debe introducir 1,2 o 3.");
                    break;
            }

        } while (opcion != 3);

    }

}
