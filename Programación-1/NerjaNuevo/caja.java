public class Caja {
    
    private static int totalEntradasAdulto;
    private static int totalEntradasNino;
    private static int totalAudioGuias;
    private static double totalIngresos;
    private static double totalDescuentos;

    public  static void registrarTicket(Ticket ticket){
        totalEntradasAdulto += ticket.getEntradasAdulto();
        totalEntradasNino = totalEntradasNino + ticket.getEntradasNino();
        totalAudioGuias= totalAudioGuias + ticket.getEntradasAudioguia();

        totalIngresos += ticket.calcularTotal();
        totalDescuentos+= ticket.calcularDescuentoAudioguias();
    }
    public static void mostrarResumenDia(){
        System.out.println("\033[32m====================================\033[0m");
        System.out.printf("\033[32m%-2.5s %s"," ","Cueva de Nerja-Resumen del día\033[0m\n");
        System.out.println("\033[32m====================================\033[0m");

         System.out.printf("%-20s %-6s %-3s","Producto","Cant.","Importe\n");
         System.out.println("------------------------------------"); 
        
         System.out.printf("%-23s %-5s %.2fE ","Adultos",totalEntradasAdulto, totalEntradasAdulto* Ticket.getPrecioAdulto());
         System.out.printf("\n%-23s %-5s %.2fE  ","Niños",totalEntradasNino, totalEntradasNino*Ticket.getPrecioNino());
         System.out.printf("\n%-23s %-5s %.2fE ","Guías",totalAudioGuias,totalAudioGuias*Ticket.getPrecioGuia());
         System.out.println("\n------------------------------------");
         System.out.printf("%-23s %-5s %.2fE\n","Total Ingresos:"," ",totalIngresos);
         System.out.printf("%-23s %-5s %.2fE\n","Total Descuento guías:"," ",totalDescuentos);
         System.out.println("\n====================================");
    }
}
