
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        int NumEntradasAdulto = 0;
        int NumEntradasNiño = 0;
        int NumAudioGuía = 0;
        double descuento = 0.17;
        double precioadulto = 9.60;
        double precioniño = 4.95;
        double precioGuía = 3.50;

        System.out.print("Nombre del cliente: ");
        nombre = scanner.nextLine();
        System.out.print("Número de entradas de adulto: ");
        NumEntradasAdulto = scanner.nextInt();
        System.out.print("Número de entradas de niño: ");
        NumEntradasNiño = scanner.nextInt();
        System.out.print("Número de audioguías: ");
        NumAudioGuía = scanner.nextInt();

        double importeadulto = NumEntradasAdulto * precioadulto;
        double importeniño = NumEntradasNiño * precioniño;
        double importeGuía = NumAudioGuía * precioGuía;
        double subtotal = importeadulto + importeGuía + importeniño;
        double descuentoguias = (NumAudioGuía * precioGuía) * descuento;
        double total = subtotal - descuentoguias;

        System.out.println("========================================");
        System.out.printf("   %24s\n", "Cueva de Nerja");
        System.out.println("========================================");
        System.out.println("Cliente: " + nombre);
        System.out.println(" ");
        System.out.println("Producto              " + " Cant.   " + "  Importe");
        System.out.println("----------------------------------------");
        System.out.println("Adultos                   " + NumEntradasAdulto + "       " + importeadulto + " e");
        System.out.println("Niños                     " + NumEntradasNiño + "        " + importeniño + " e");
        System.out.println("Guías                     " + NumAudioGuía + "        " + importeGuía + " e");
        System.out.println("----------------------------------------");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Subtotal:                        " + subtotal + " e");
        System.out.printf("Descuento guías:                 %.2f e\n", descuentoguias);
        System.out.printf("\033[47m\033[31m\033[1m%S                  %.2f e\n\033[0m", "TOTAL A PAGAR:", total);
        System.out.println("\033[0m========================================");

    }
}
