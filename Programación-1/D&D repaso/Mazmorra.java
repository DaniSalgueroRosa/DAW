
import java.util.Random;
import java.util.Scanner;

public class Mazmorra {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("1. Atacar con arma");
            System.out.println("2. Beber poción");
            int opcion = leerEntero();
            switch (opcion) {
                case 1:
                    int tirada = tirarDado20();
                    if(tirada == 20){
                        enemigo.recibirDano (aventurero.getDanoBaseAventurero() * 2);
                    }else if (tirada == 1){
                        System.out.println("¿El ping pong no te gusta?");
                    }else{
                        aventurero.atacar(enemigo);
                    }
                    break;
                case 2:
                    if (aventurero.getCantidadPociones == 0){
                        System.out.println("Que mala gestión quillo");
                    }else if{ 
                        aventurero.beberPocion();
                        aventurero.getCantidadPociones--;

                    }
                    default:
                    System.out.println("Opción no válida");;
                }
                if (!enemigo.estaDerrotado()){
                    enemigo.atacar(aventurero);
                }
        } while (!aventurero.estaCaido && !enemigo.estaDerrotado);
        if(eneigo.estaDerrotado()){
            System.out.println("Has ganado");
        }else{
            System.out.println("Fin de la partida");
        }
    } 

    private static int leerEntero() {
        int numero = 0;
        boolean correcto = false;
        while (!correcto) {
            try {
                System.out.print("Elige una opción: ");
                numero = Integer.parseInt(scanner.nextLine());
                correcto = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Escribe un número entero");
            }

        }
        return numero;
    }

    private static int tirarDado20() {
        Random dado = new Random();
        return dado.nextInt(20) + 1;
    }

}
