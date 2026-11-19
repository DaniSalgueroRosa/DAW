import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegistroClimatico registro = new RegistroClimatico();

        Scanner teclado = new Scanner(System.in);

        int opcion;

        System.out.println("Registro climático anual de Málaga (datos simulados)");

        do {
            mostrarMenu();

            opcion = leerEntero(teclado, "Elige una opción: ");

            switch (opcion) {
                case 1:
                    registro.mostrarTabla();
                    break;

                case 2:
                    opcionMediaMes(registro, teclado);
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Máxima: " + registro.diaMasCaluroso());
                    System.out.println("Mínima: " + registro.diaMasFrio());
                    break;

                case 4:
                    int dias = registro.contarDiasSuperioresA(30);
                    System.out.println();
                    System.out.println("Días de calor extremo (más de 30°C): " + dias);
                    break;

                case 5:
                    double verano = registro.mediaVerano();
                    double invierno = registro.mediaInvierno();
                    System.out.println();
                    System.out.printf("Media de verano (jun-jul-ago):   %.2f°C%n", verano);
                    System.out.printf("Media de invierno (dic-ene-feb): %.2f°C%n", invierno);
                    System.out.printf("Diferencia entre estaciones:     %.2f°C%n", verano - invierno);
                    break;

                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida. Elige un número del 0 al 5.");
            }
        } while (opcion != 0);

        teclado.close();
    }

    private static void mostrarMenu() {
        System.out.println();
        System.out.println("========== MENÚ ==========");
        System.out.println("1. Mostrar tabla anual");
        System.out.println("2. Temperatura media de un mes");
        System.out.println("3. Día más caluroso y más frío del año");
        System.out.println("4. Días de calor extremo (Terral)");
        System.out.println("5. Comparativa verano / invierno");
        System.out.println("0. Salir");
        System.out.println("==========================");
    }

    private static void opcionMediaMes(RegistroClimatico registro, Scanner teclado) {
        int mes = leerEntero(teclado, "Número del mes (1-12): ");

        try {
            double media = registro.temperaturaMediaMes(mes);

            System.out.printf("Temperatura media de %s: %.2f°C%n",
                              registro.getNombreMes(mes).toLowerCase(), media);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static int leerEntero(Scanner teclado, String mensaje) {
        while (true) {
            System.out.print(mensaje);

            String texto = teclado.nextLine().trim();

            try {
                return Integer.parseInt(texto);
            } catch (NumberFormatException e) {
                System.out.println("Error: \"" + texto + "\" no es un número entero. Inténtalo de nuevo.");
            }
        }
    }
}