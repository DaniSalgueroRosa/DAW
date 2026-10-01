import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cargo;
        int escivil;
        int viaje;
        int dinero;
        double bruto;
        double irpf;
        double neto;
        System.out.println("1 - Programador junior ");
        System.out.println( "2 - Prog. senior ");
        System.out.println("3 - Jefe de Proyecto");
        System.out.print("Introduzca el cargo del empleado: ");
        cargo = scanner.nextInt();
        System.out.print("Introduzca cuantos días ha estado de viaje visitando clientes: ");
        viaje = scanner.nextInt();
        System.out.print("Introduzca su estado civil ( 1- soltero , 2 - casado): ");
        escivil = scanner.nextInt();
        if (cargo == 1 && escivil == 1){
            dinero = 30 * viaje;
            bruto = dinero + 950;
            irpf = 950 * 0.25;
            neto = 950 - irpf;
             System.out.println("-------------------------------");
            System.out.println("| Sueldo base: 950.00         |");
            System.out.println("|Dietas: " +  dinero + "                   |");
            System.out.println("|-----------------------------|");
            System.out.println("|Sueldo bruto:"+ bruto + "           |");
            System.out.println("|Retención IRPF (25%): " + irpf + "  |");
            System.out.println("|-----------------------------|");
            System.out.println("|Suelto neto: " + neto + "           |");
            System.out.println("|-----------------------------|");
        }  else  if (cargo == 1 && escivil == 2){
            dinero = 30 * viaje;
            bruto = dinero + 950;
            irpf = 950 * 0.2;
            neto = 950 - irpf;
             System.out.println("-------------------------------");
            System.out.println("| Sueldo base: 950.00         |");
            System.out.println("|Dietas: " +  dinero + "                   |");
            System.out.println("|-----------------------------|");
            System.out.println("|Sueldo bruto:"+ bruto + "           |");
            System.out.println("|Retención IRPF (20%): " + irpf + "  |");
            System.out.println("|-----------------------------|");
            System.out.println("|Suelto neto: " + neto + "           |");
            System.out.println("|-----------------------------|");
        }  else  if (cargo == 2 && escivil == 1){
            dinero = 30 * viaje;
            bruto = dinero + 1200;
            irpf = 1200 * 0.25;
            neto = 1200 - irpf;
             System.out.println("-------------------------------");
            System.out.println("| Sueldo base: 1200.00        |");
            System.out.println("|Dietas: " +  dinero + "                   |");
            System.out.println("|-----------------------------|");
            System.out.println("|Sueldo bruto:"+ bruto + "          |");
            System.out.println("|Retención IRPF (25%): " + irpf + "  |");
            System.out.println("|-----------------------------|");
            System.out.println("|Suelto neto: " + neto + "           |");
            System.out.println("|-----------------------------|");
        } else  if (cargo == 2 && escivil == 2){
            dinero = 30 * viaje;
            bruto = dinero + 1200;
            irpf = 1200 * 0.20;
            neto = 1200 - irpf;
             System.out.println("-------------------------------");
            System.out.println("| Sueldo base: 1200.00        |");
            System.out.println("|Dietas: " +  dinero + "                   |");
            System.out.println("|-----------------------------|");
            System.out.println("|Sueldo bruto:"+ bruto + "          |");
            System.out.println("|Retención IRPF (20%): " + irpf + "  |");
            System.out.println("|-----------------------------|");
            System.out.println("|Suelto neto: " + neto + "           |");
            System.out.println("|-----------------------------|");
        }else  if (cargo == 3 && escivil == 1){
            dinero = 30 * viaje;
            bruto = dinero + 1600;
            irpf = 1600 * 0.25;
            neto = 1600 - irpf;
             System.out.println("-------------------------------");
            System.out.println("| Sueldo base: 1600.00        |");
            System.out.println("|Dietas: " +  dinero + "                   |");
            System.out.println("|-----------------------------|");
            System.out.println("|Sueldo bruto:"+ bruto + "          |");
            System.out.println("|Retención IRPF (25%): " + irpf + "  |");
            System.out.println("|-----------------------------|");
            System.out.println("|Suelto neto: " + neto + "          |");
            System.out.println("|-----------------------------|");
        }else  if (cargo == 3 && escivil == 2){
            dinero = 30 * viaje;
            bruto = dinero + 1600;
            irpf = 1600 * 0.2;
            neto = 1600 - irpf;
             System.out.println("-------------------------------");
            System.out.println("| Sueldo base: 1600.00        |");
            System.out.println("|Dietas: " +  dinero + "                   |");
            System.out.println("|-----------------------------|");
            System.out.println("|Sueldo bruto:"+ bruto + "          |");
            System.out.println("|Retención IRPF (20%): " + irpf + "  |");
            System.out.println("|-----------------------------|");
            System.out.println("|Suelto neto: " + neto + "          |");
            System.out.println("|-----------------------------|");
        }
    }
}
