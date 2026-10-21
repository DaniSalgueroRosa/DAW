
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        int entradaAdulto;
        int entradaNinio;
        int audioguia;
        do {
            caja caja1 = new caja();
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
                    ticket ticket = new ticket(entradaAdulto, entradaNinio, audioguia);
                    ticket.imprimirTicket();
                    caja1.registrarTicket(ticket);
                    break;
                case 2:
                    caja1.mostrarResumenDia();
                    
            }

        } while (true);

    }

}
