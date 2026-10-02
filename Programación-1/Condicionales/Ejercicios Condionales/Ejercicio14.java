
import java.util.Scanner;

public class Ejercicio14 {
//definir variables, no tener hardcodes (números asi tochos)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cargo = 0;
        int escivil = 0;
        int viaje = 0;
        double dietas = 0;
        double bruto = 0;
        double irpf = 0;
        double neto = 0;
        double sueldo1 = 950;
        double sueldo2 = 1200;
        double sueldo3 = 1600;
        double Importedietas = 30;

        System.out.println("1 - Programador junior ");
        System.out.println("2 - Prog. senior ");
        System.out.println("3 - Jefe de Proyecto");
        System.out.print("Introduzca el cargo del empleado: ");
        cargo = scanner.nextInt();
        if (cargo > 3 || cargo <= 0) {
            System.out.println("No hay más cargos. Introduzca de nuevo el número");
        } else {
            System.out.print("Introduzca cuantos días ha estado de viaje visitando clientes: ");
            viaje = scanner.nextInt();
            if (viaje < 0) {
                System.out.println("No puede haber ido de viaje dias negativos");
            } else {
                System.out.print("Introduzca su estado civil ( 1- soltero , 2 - casado): ");
                escivil = scanner.nextInt();
                if (escivil > 2 || escivil <= 0) {
                    System.out.println("No existe otro estado civil. Introduzca de nuevo el número");
                } else {
                    if (cargo == 1 && escivil == 1) {
                        dietas = Importedietas * viaje;
                        bruto = dietas + sueldo1;
                        irpf = sueldo1 * 0.25;
                        neto = sueldo2 - irpf;
                        System.out.println("-------------------------------");
                        System.out.println("| Sueldo base: " + sueldo1 + "         |");
                        System.out.println("|Dietas: " + dietas + "                   |");
                        System.out.println("|-----------------------------|");
                        System.out.println("|Sueldo bruto:" + bruto + "           |");
                        System.out.println("|Retención IRPF (25%): " + irpf + "  |");
                        System.out.println("|-----------------------------|");
                        System.out.println("|Suelto neto: " + neto + "           |");
                        System.out.println("|-----------------------------|");
                    } else if (cargo == 1 && escivil == 2) {
                        dietas = Importedietas * viaje;
                        bruto = dietas + sueldo1;
                        irpf = sueldo1 * 0.2;
                        neto = sueldo1 - irpf;
                        System.out.println("-------------------------------");
                        System.out.println("| Sueldo base: " + sueldo1 + "         |");
                        System.out.println("|Dietas: " + dietas + "                   |");
                        System.out.println("|-----------------------------|");
                        System.out.println("|Sueldo bruto:" + bruto + "           |");
                        System.out.println("|Retención IRPF (20%): " + irpf + "  |");
                        System.out.println("|-----------------------------|");
                        System.out.println("|Suelto neto: " + neto + "           |");
                        System.out.println("|-----------------------------|");
                    } else if (cargo == 2 && escivil == 1) {
                        dietas = Importedietas * viaje;
                        bruto = dietas + sueldo2;
                        irpf = sueldo2 * 0.25;
                        neto = sueldo2 - irpf;
                        System.out.println("-------------------------------");
                        System.out.println("| Sueldo base: " + sueldo2 + "         |");
                        System.out.println("|Dietas: " + dietas + "                   |");
                        System.out.println("|-----------------------------|");
                        System.out.println("|Sueldo bruto:" + bruto + "          |");
                        System.out.println("|Retención IRPF (25%): " + irpf + "  |");
                        System.out.println("|-----------------------------|");
                        System.out.println("|Suelto neto: " + neto + "           |");
                        System.out.println("|-----------------------------|");
                    } else if (cargo == 2 && escivil == 2) {
                        dietas = Importedietas * viaje;
                        bruto = dietas + sueldo2;
                        irpf = sueldo2 * 0.20;
                        neto = sueldo2 - irpf;
                        System.out.println("-------------------------------");
                        System.out.println("| Sueldo base: " + sueldo2 + "         |");
                        System.out.println("|Dietas: " + dietas + "                   |");
                        System.out.println("|-----------------------------|");
                        System.out.println("|Sueldo bruto:" + bruto + "          |");
                        System.out.println("|Retención IRPF (20%): " + irpf + "  |");
                        System.out.println("|-----------------------------|");
                        System.out.println("|Suelto neto: " + neto + "           |");
                        System.out.println("|-----------------------------|");
                    } else if (cargo == 3 && escivil == 1) {
                        dietas = Importedietas * viaje;
                        bruto = dietas + sueldo3;
                        irpf = sueldo3 * 0.25;
                        neto = sueldo3 - irpf;
                        System.out.println("-------------------------------");
                        System.out.println("| Sueldo base: " + sueldo3 + "         |");
                        System.out.println("|Dietas: " + dietas + "                   |");
                        System.out.println("|-----------------------------|");
                        System.out.println("|Sueldo bruto:" + bruto + "          |");
                        System.out.println("|Retención IRPF (25%): " + irpf + "  |");
                        System.out.println("|-----------------------------|");
                        System.out.println("|Suelto neto: " + neto + "          |");
                        System.out.println("|-----------------------------|");
                    } else if (cargo == 3 && escivil == 2) {
                        dietas = Importedietas * viaje;
                        bruto = dietas + sueldo3;
                        irpf = sueldo3 * 0.2;
                        neto = sueldo3 - irpf;
                        System.out.println("-------------------------------");
                        System.out.println("| Sueldo base: " + sueldo3 + "         |");
                        System.out.println("|Dietas: " + dietas + "                   |");
                        System.out.println("|-----------------------------|");
                        System.out.println("|Sueldo bruto:" + bruto + "          |");
                        System.out.println("|Retención IRPF (20%): " + irpf + "  |");
                        System.out.println("|-----------------------------|");
                        System.out.println("|Suelto neto: " + neto + "          |");
                        System.out.println("|-----------------------------|");
                    }
                }
            }
        }
    }
}
