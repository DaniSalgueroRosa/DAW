
import java.util.InputMismatchException;
import java.util.Scanner;

public class EscapeRoom {

    public static int lecturaSegura() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        boolean esNatural = false;
        do {
            try {
                opcion = scanner.nextInt();
                if (opcion <= 0) {
                    esNatural = false;
                    System.out.println("No se permiten números negativos ");
                    System.out.println("Por davor, introduzca una opción válida");
                } else if (opcion > 4) {
                    esNatural = false;
                    System.out.println("Por favor, introduzca una opcion válida ");
                } else {
                    esNatural = true;
                }
            } catch (InputMismatchException exception) {
                System.out.println("El teclado solo permite números enteros. Introduzca una opción válida");
            }
        } while (!esNatural);
        return opcion;
    }

    public static int generarPista() {
        return (int) (Math.random() * 9) + 1;
    }

    public static int generarCodigoSecreto(int pistaCuadro, int pistaCajon, int pistaAlfombra) {
        int codigoSecreto;
        codigoSecreto = (pistaCuadro * 100 + pistaCajon * 10 + pistaAlfombra);
        return codigoSecreto;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pistaCuadro = generarPista();
        int pistaCajon = generarPista();
        int pistaAlfombra = generarPista();
        int codigoSecreto = generarCodigoSecreto(pistaCuadro, pistaCajon, pistaAlfombra);

        Habitacion habitacion = new Habitacion(pistaCuadro, pistaCajon, pistaAlfombra);
        CajaFuerte caja = new CajaFuerte(codigoSecreto, 3);

        try {
            do {
                int opcion;
                System.out.println("Bienvenido al juego");
                System.out.println("¿Que quieres hacer?");
                System.out.println("1. Mirar detrás del cuadro");
                System.out.println("2. Abrir el cajón");
                System.out.println("3. Levantar la alfombra");
                System.out.println("4. Ir a la caja fuerte");
                System.out.print("Elija una opción: ");
                opcion = lecturaSegura();

                switch (opcion) {
                    case 1:
                        habitacion.inspeccionarCuadro();
                        break;
                    case 2:
                        habitacion.inspeccionarCajon();
                        break;
                    case 3:
                        habitacion.inspeccionarAlfombra();
                        break;
                    case 4:
                        int combinacion = 0;
                        System.out.print("Introduzca su código: ");
                        combinacion = scanner.nextInt();
                        if (combinacion < 999){
                            caja.intentarAbrir(codigoSecreto);   
                        }else if (combinacion < 0){
                            System.out.println("Opción no válida");
                        }   
                        break;
                   
                        
                }

            } while (caja.estaAbierta() || caja.bloqueada());

        } catch (Exception e) {

        }
    }
}
