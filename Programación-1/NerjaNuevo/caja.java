
public class caja {

    private static int totalEntradasAdulto;
    private static int totalEntradasNinio;
    private static int totalAudioguia;
    private static double ingresosTotales;
    private static double descuentosAplicados;

    public void registrarTicket(ticket ticket) {
        totalEntradasAdulto += ticket.getEntradaAdulto();
        totalEntradasNinio += ticket.getEntradaNinio();
        totalAudioguia += ticket.getAudioguia();
        ingresosTotales += ticket.calcularTotal();
        descuentosAplicados += ticket.calcularDescuentoAudioguias();
    }

    public void mostrarResumenDia() {
        System.out.println("========================================");
        System.out.printf("   %24s\n", "Cueva de Nerja - Resumen del día");
        System.out.println("========================================");

        System.out.printf("%-20s %-11s %s\n", "Producto", "Cant", "Importe");
        System.out.println("----------------------------------------");

        System.out.printf("%-20s %-11.2f\n", "Adultos:", totalEntradasAdulto);
        System.out.printf("%-20s %-11.2f\n", "Niños:", totalEntradasNinio);
        System.out.printf("%-20s %-11.2f\n", "Audioguías:", totalAudioguia);
        System.out.println("----------------------------------------");
        System.out.println(" ");
        System.out.printf("%-20s %-11.2f\n", "Descuento guías", descuentosAplicados );
        System.out.println("========================================");
        System.out.printf("\033[47m\033[31m\033[1m%S                  %.2f e\n\033[0m", "TOTAL GANADO:",  ingresosTotales);
    }

}
