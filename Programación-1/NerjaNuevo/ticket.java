
public class ticket {

    private int entradaAdulto;
    private int entradaNinio;
    private int audioguia;

    static final double precioAdulto = 9.60;
    static final double precioNinio = 4.95;
    static final double precioAudioguia = 3.50;
    static final double descuentoAudioguia = 0.17;

   

    public ticket(int entradaAdulto, int entradaNinio, int audioguia) {
        this.entradaAdulto = entradaAdulto;
        this.entradaNinio = entradaNinio;
        this.audioguia = audioguia;
    }

    public double calcularSubtotal() {
        double subtotalAdulto = entradaAdulto * precioAdulto;
        double subtotalNinio = entradaNinio * precioNinio;
        double subtotalAudioguia = audioguia * precioAudioguia;
        double subtotal = subtotalAdulto + subtotalNinio + subtotalAudioguia;
        return subtotal;
    }

    public double calcularDescuentoAudioguias() {
        double ahorro = (audioguia * precioAudioguia) * descuentoAudioguia;
        return ahorro;

    }

    public double calcularTotal() {
        double total = calcularSubtotal() - calcularDescuentoAudioguias();
        return total;
    }  
    ;

    public void imprimirTicket() {
        System.out.println("========================================");
        System.out.printf("   %24s\n", "Cueva de Nerja");
        System.out.println("========================================");

        System.out.printf("%-20s %-11s %s\n","Producto", "Cant", "Importe");
        System.out.println("----------------------------------------");

        double importeAdulto = entradaAdulto * precioAdulto;
        double importeNinio = entradaNinio * precioNinio;
        double importeAudioguia = audioguia * precioAudioguia; 

        System.out.printf("%-20s %-11s %.2f\n", "Adultos:", entradaAdulto, importeAdulto);
        System.out.printf("%-20s %-11s %.2f\n", "Niños:", entradaNinio, importeAdulto);
        System.out.printf("%-20s %-11s %.2f\n", "Audioguías:", audioguia, importeAudioguia);
        System.out.println("----------------------------------------");
        System.out.println(" ");
        System.out.printf("%-20s %.2f\n", "Subtotal", calcularSubtotal() );
        System.out.printf("%-20s %.2f\n", "Descuento guías", calcularDescuentoAudioguias() );
        System.out.println("========================================");
        System.out.printf("\033[47m\033[31m\033[1m%S                  %.2f e\n\033[0m", "TOTAL A PAGAR:",  calcularTotal());
    }

    public int getEntradaAdulto() {
        return entradaAdulto;
    }

    public int getEntradaNinio() {
        return entradaNinio;
    }

    public int getAudioguia(){
        return audioguia;
    }

    public static double getPrecioAdulto(){
        return precioAdulto;
    }

    public static double getPrecioNinio() {
        return precioNinio;
    }

    public static double getPrecioAudioguia(){
        return precioAudioguia;
    }
    public static double getDescuentoAudioguia(){
        return descuentoAudioguia;
    }
    
   
}
