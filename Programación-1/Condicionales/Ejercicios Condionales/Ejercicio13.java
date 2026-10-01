import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day;
        int day1;
        int hour;
        int min;
        int minrest;

        System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
        day = scanner.nextLine();
        System.out.print("A continuación, porfavor introduzca la hora (Hora y minutos)\n");
        System.out.print("Hora: ");
        hour = scanner.nextInt();
        System.out.print("Minutos: ");
        min = scanner.nextInt();
        if (day.equals("Lunes") || day.equals("lunes")) {
            day1 = 1;
            minrest = (day1 * 4) * 1440 + (15 - hour) * 60 + - min;
            System.out.println("Quedan " + minrest + " minutos para el fin de semana");
        }
        if (day.equals("Martes") || day.equals("martes")) {
            day1 = 1;
            minrest = (day1 * 3) * 1440 + (15 - hour) * 60 -min;
            System.out.println("Quedan " + minrest + " minutos para el fin de semana");
        }
        if (day.equals("Miércoles") || day.equals("miércoles") || day.equals("miercoles") || day.equals("Miercoles")) {
            day1 = 1;
            minrest = (day1 * 2) * 1440 + (15 - hour) * 60   -min;
            System.out.println("Quedan " + minrest + " minutos para el fin de semana");
        }
        if (day.equals("Jueves") || day.equals("jueves")) {
            day1 = 1;
            minrest = (day1 * 1) * 1440 + (15 - hour) * 60 -min;
            System.out.println("Quedan " + minrest + " minutos para el fin de semana");
        }
        if (day.equals("Viernes") || day.equals("viernes")) {
            day1 = 1;
            minrest = (day1 * 0) * 1440 + (15 - hour) * 60 -min;
            if (minrest < 0 || minrest == 0) {
                System.out.println("Ya es fin de semana, disfruta!");
            } else if (minrest > 0) {
                System.out.println("Quedan " + minrest + " minutos para el fin de semana");
            }
        }
    }
}
