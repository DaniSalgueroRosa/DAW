
public class PrácticaMonitor2 {

    public static void main(String[] args) {

        PrácticaMonitor bigMonitor = new PrácticaMonitor(30.0, 12.0);
        PrácticaMonitor smallMonitor = new PrácticaMonitor(19.5, 3.2);
        bigMonitor.on();
        smallMonitor.on();
        System.out.println("El tamaño del monitor grande es: " + bigMonitor.size);
        System.out.println("Y pesa: " + bigMonitor.weight);
        smallMonitor.off();

    }
}
