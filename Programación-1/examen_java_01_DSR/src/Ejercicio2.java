
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distancia = 0;
        double consumo = 0;
        int ocupantes = 0;
        double preciocombustible = 0;

        System.out.print("Distancia trayecto (km): ");
        distancia = scanner.nextDouble();
        System.out.print("Consumo (L/100km): ");
        consumo = scanner.nextDouble();
        System.out.print("Ocupantes: ");
        ocupantes = scanner.nextInt();
        System.out.print("Precio de combustible (e/L): ");
        preciocombustible = scanner.nextDouble();

        double combustibleconsumido = consumo * (distancia * 0.01);
        double costeviaje = combustibleconsumido * preciocombustible;
        double costeocupante = costeviaje / ocupantes;
        double ahorrado = costeviaje * ocupantes - costeviaje;

        System.out.println("========================================");
        System.out.printf("       %s\n", "Parking CPIFP Alan Turing ");
        System.out.println("========================================");
        System.out.printf("\033[91mCombustible consumido: %.2f\n", combustibleconsumido, " litros");
        System.out.printf("\033[47m\033[30mCoste viaje: %.2f e\n\033[0m", costeviaje);
        System.out.printf("\033[33mCoste por ocupante: %.2f e\n\033[0m", costeocupante);
        System.out.printf("\033[32m\033[1mTotal Ahorrado: %.2f e\033[0m", ahorrado);

    }
}
