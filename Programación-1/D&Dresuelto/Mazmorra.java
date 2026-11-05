
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Mazmorra {

    private static Scanner scanner = new Scanner(System.in);
    private static Aventurero aventurero;
    private static Enemigo enemigo;

    public static void main(String[] args) {
        inicializarJuego();
        while (!aventurero.estaCaido() || !enemigo.estaDerrotado()) {
            System.out.println("Elija una opción: ");
            System.out.println("1. Atacar");
            System.out.println("2. Tomar poción");
            int accion = leerNaturalSeguro();
            switch(accion){
                case 1 -> {
                    int resultado = tirarDado20();
                    if (resultado==1){
                        System.out.println("Al palo");
                    }
                    if(resultado==20){
                        aventurero.atacar(enemigo);
                        aventurero.atacar(enemigo);
                    }
                    if (resultado> 1 && resultado<20){
                        aventurero.atacar(enemigo);
                    }
                }
                case 2 ->{

                }
                default -> {
                    System.out.println("Acción incorrecta, vuelva a introducir");
                }
            }
        }
    }

    private static void inicializarJuego() {
        aventurero = new Aventurero("Gandalf", 500 , 25);
        enemigo = new Enemigo();
    }

    private static int tirarDado20() {
        return new Random().nextInt(20) + 1;
    }

    private static int leerNaturalSeguro() {
        Scanner Scanner = new Scanner(System.in);
        int natural = 0;
        boolean esNatural = false;
        do {
            try {
                natural = Scanner.nextInt();
                if (natural <= 0) {
                    System.out.println("Introduzca un numero mayor que 0");
                } else {
                    esNatural = true;
                }
            } catch (InputMismatchException ex) {
                System.out.println("No es un numero.Introduzcalo de nuevo");
                Scanner.next();
            } catch (Exception ex) {
            }
        } while (!esNatural);
        return natural;
    }

}
