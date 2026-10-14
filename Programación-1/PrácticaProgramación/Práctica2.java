import java.util.Scanner;

public class Práctica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int hour = 0;
        double irpf = 0;
        double pxh = 0;

        System.out.print("Introduzca su nombre y apellidos: ");
        name = scanner.nextLine();
        System.out.print("Introduzca el número de horas trabajados y su salario por hora: ");
        hour = scanner.nextInt();
        pxh = scanner.nextDouble();
        System.out.print("Introduzca su rango de irpf: ");
        irpf = scanner.nextDouble();

        double bruto = hour * pxh;
        double reducción = bruto * (irpf * 0.01);
        double neto = bruto - reducción;

        System.out.println("Nombre: " + name);
        System.out.println("Horas trabajadas: " + hour);
        System.out.println("Salario por horas: " + pxh);
        System.out.println("Tasa correspondiente de irpf: " + irpf + "%");
        System.out.println("----Nómina----");
        System.out.println("Salario bruto: " + bruto);

        System.out.println("Retención del IRPF: " + reducción);
        System.out.println("Salario neto: " + neto);
    }
}
