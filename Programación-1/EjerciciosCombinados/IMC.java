
import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        double altura = 0;
        double peso = 0;
        boolean alturaBien = false;
        boolean pesoBien = false;
        int continuar;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca su altura en metros: ");
        altura = scanner.nextDouble();
        if (altura > 3) {
            alturaBien = true;

            do {
                System.out.print("Introduzca su altura en metros: ");
                altura = scanner.nextDouble();
            } while (alturaBien == false);
        }
        System.out.print("Introduzca su peso en kilogramos: ");
        peso = scanner.nextDouble();
        if (peso > 400) {
            pesoBien = true;

            do {
                System.out.print("Introduzca su peso en kilogramos: ");
                altura = scanner.nextDouble();
            } while (pesoBien == false);

        }
        double imc = peso / (altura * altura);
        System.out.printf("Su imc es de %.2f\n", imc);
        if (imc < 18.5 || imc > 30) {
            System.out.println("Porfavor visite un especialista");
        }
        if (imc > 18.5 && imc < 24.9) {
            System.out.println("Está en un peso saludable");
        }
        if (imc > 24.9 && imc <= 29.9) {
            System.out.println("Tiene sobrepeso, debe cuidarse");
        }
    }
}
