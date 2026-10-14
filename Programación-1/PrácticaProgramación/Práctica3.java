import java.util.Scanner;

public class Práctica3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        String DNI;
        String NombreTec;
        int IDtrabajo;
        double PrecioProcesador;
        int UnidadesProcesador;
        double PrecioPlacaBase;
        int UnidadesPlacaBase;
        double PrecioRam;
        int UnidadesRam;
        double PrecioGráfica;
        int UnidadesGráfica;
        double PrecioSSD;
        int UnidadesSSD;

        /*Parte 1 */ 
        System.out.println("Datos del cliente y del pedido");

        System.out.print("Introduzca su nombre y apellidos: ");
        nombre = scanner.nextLine();
        System.out.print("Introduzca su DNI: ");
        DNI = scanner.nextLine();
        System.out.print("Introduzca el nombre del técnico: ");
        NombreTec = scanner.nextLine();
        System.out.print("Introduzca el nombre de su pedido: ");
        IDtrabajo = scanner.nextInt();
        System.out.print("Introduzca el precio del procesador y en caso de que haya comprado, el número de procesadores adquiridos: ");
        PrecioProcesador = scanner.nextDouble();
        UnidadesProcesador = scanner.nextInt();
        System.out.print("Introduzca el precio de la Placa Base y en caso de que haya comprado, el número de Placas Bases adquiridas: ");
        PrecioPlacaBase = scanner.nextDouble();
        UnidadesPlacaBase = scanner.nextInt();
        System.out.print("Introduzca el precio de la Memoria Ram y en caso de que haya comprado, el número de Memorias Ram adquiridas: ");
        PrecioRam = scanner.nextDouble();
        UnidadesRam = scanner.nextInt();
        System.out.print("Introduzca el precio de las Tarjetas Gráficas y en caso de que haya comprado, el número de Tarjetas gráficas adquiridas: ");
        PrecioGráfica = scanner.nextDouble();
        UnidadesGráfica = scanner.nextInt();
        System.out.print("Introduzca el precio de las Tarjetas SSD y en caso de que haya comprado, el número de Tarjetas SSD adquiridas: ");
        PrecioSSD = scanner.nextDouble();
        UnidadesSSD = scanner.nextInt();

        /*Parte 2 */
        double horasmontaje = 0;
        double preciohoramontaje = 0;
        double horasmantenimiento = 0;
        double preciohoramantenimiento = 0;
        double costetransporte = 0;
        double costemateriales = 0;
        System.out.println("Mano de obra y servicios");
        System.out.print("Introduzca las horas de montaje: ");
        horasmontaje = scanner.nextDouble();
        System.out.print("Introduzca el precio de cada hora de montaje: ");
        preciohoramontaje = scanner.nextDouble();
        System.out.print("Introduzca las horas de mantenimiento: ");
        horasmantenimiento = scanner.nextDouble();
        System.out.print("Introduzca el precio de las horas de mantenimiento: ");
        preciohoramantenimiento = scanner.nextDouble();
        System.out.print("Introduzca el coste del transporte: ");
        costetransporte = scanner.nextDouble();
        System.out.print("Introduzca el precio de los materiales: ");
        costemateriales = scanner.nextDouble();
         
        double costeProcesador = PrecioProcesador * UnidadesProcesador;
        double costePlacaBase = PrecioPlacaBase * UnidadesPlacaBase;
        double costeRam = PrecioRam * UnidadesRam;
        double costeGráfica = PrecioGráfica * UnidadesGráfica;
        double costeSSD = PrecioSSD * UnidadesSSD;
        double montaje = horasmontaje * preciohoramontaje;
        double mantenimiento = horasmantenimiento * preciohoramantenimiento;
        
        double PrecioTotal = costeGráfica + costePlacaBase + costeProcesador + costeRam + costeSSD + costemateriales + costetransporte + montaje + mantenimiento;

        System.out.println("Por ahora el precio de los procesadores es: " + costeProcesador + " euros");
        System.out.println("Por ahora el precio de las placas bases es: " + costePlacaBase + " euros");
        System.out.println("Por ahora el precio de las memorias ram es: " + costeRam + " euros");
        System.out.println("Por ahora el precio de los tarjetas gráficas es: " + costeGráfica + " euros");
        System.out.println("Por ahora el precio de las tarjetas SSD es: " + costeSSD + " euros" );
        System.out.println("El coste del montaje es de: " + montaje + " euros");
        System.out.println("El coste del mantenimiento es de " + mantenimiento + " euros");

        System.out.println("El precio total por ahora es de: " + PrecioTotal + " euros ");
        

    }

}
