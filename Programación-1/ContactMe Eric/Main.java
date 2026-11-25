import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Agenda agenda = new Agenda(2);
        int opcion = 0;

        do {
            try {
                System.out.println("Elige una opcion");
                System.out.println("1. Añadir contacto");
                System.out.println("2. Imprimir Agenda");
                System.out.println("3. Salir");
                opcion = scan.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Eso no es un numero, escribe uno");
                scan.next();
            }

            switch (opcion) {
                case 1 -> {
                    if (!agenda.estaCompleta()) {
                        System.out.println("Nombre: ");
                        scan.next();
                        String nombre = scan.nextLine();
                        System.out.println("Primer apellido: ");
                        String apellido1 = scan.nextLine();
                        System.out.println("Segundo apellido: ");
                        String apellido2 = scan.nextLine();
                        System.out.println("Numero de telefono: ");
                        int telefono = scan.nextInt();
                        System.out.println("Correo electronico: ");
                        scan.next();
                        String correo = scan.nextLine();

                        Contactos contacto = new Contactos(nombre, apellido1, apellido2, telefono, correo);
                        agenda.aniadirContacto(contacto);

                    } else {
                        System.out.println("Agenda esta completa, no puedes añadir un contacto");
                    }
                }

                case 2 -> {
                    
                }

                case 3 -> {
                    System.out.println("Hasta luego");
                }

                default -> {
                    System.out.println("Escribe un numero valido anda");
                }
            }
        } while (opcion != 3);
    }
}
