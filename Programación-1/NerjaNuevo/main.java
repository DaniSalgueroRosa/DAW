import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
        
    }
    private static int leerNaturalSeguro(){
        Scanner Scanner = new Scanner(System.in);
        int natural = 0;
        boolean esNatural= false;
        do { 
            try {
                natural = Scanner.nextInt();
                if (natural <=0){
                    System.out.println("Introduzca un numero mayor que 1");
                }
                else {
                    esNatural=true;
                }   
            } 
            catch (InputMismatchException ex) {
                System.out.println("No es un numero.Introduzcalo de nuevo");
                Scanner.next();
            }
            catch(Exception ex){
            }
        }while (!esNatural);
       return natural;
    }

    private static void menu(){
        int opcion;
        do { 
            System.out.println("Cueva de Nerja");
            System.out.println("¿Que desea hacer?");
            System.out.println("1.Jugar GTAVI");
            System.out.println("2.Ver Doomsday");
            System.out.println("3.Irme a mi casa");
            opcion = leerNaturalSeguro();

            switch (opcion){
                case 1: {
                    //TODO Corregir esto
                    System.out.println("Entradas adulto:");
                    int entradasAdulto = leerNaturalSeguro();
                    System.out.println("Entradas niño:");
                    int entradasNino = leerNaturalSeguro();
                    System.out.println("Audioguias:");
                    int audioguia = leerNaturalSeguro();
                    Ticket ticket = new Ticket(entradasAdulto, entradasNino, audioguia);
                    Caja.registrarTicket(ticket);
                }
                case 2: {
                    Caja.mostrarResumenDia();
                }
                case 3: {
                    System.out.println("Hasta luego!");
                    break;
                }
                default:{
                    System.out.printf("Ha introducido %d. Solo son validas las opciones 1,2 y 3.",opcion);
                    break;
                }
            }
            
        } while (opcion!=3);
    }
}
