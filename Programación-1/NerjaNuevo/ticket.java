public class Ticket {
    private static final double precioAdulto = 9.60;
    private static final double precioNino = 4.95;
    private static final double precioGuia = 3.50;
    private static final double descuentoGuia = 0.17;
    
    private int entradasAdulto;
    private int entradasNino;
    private int entradaAudioguia;


    public Ticket (int entradasAdulto, int entradasNino, int audioguia){
        this.entradasAdulto = entradasAdulto;
        this.entradasNino = entradasNino;
        this.entradaAudioguia = audioguia;
    }

    public double calcularSubtotal (){

        double subtotalAdulto = precioAdulto * entradasAdulto;
        double subtotalNino = precioNino * entradasNino;
        double subtotalGuia = precioGuia * entradaAudioguia;
        double subtotal = subtotalAdulto + subtotalNino 
        -++ subtotalGuia;
        return subtotal;
    }

    public double calcularDescuentoAudioguias(){
        
        double ahorro =(precioGuia*entradaAudioguia)*descuentoGuia;
        return ahorro;        
    }

    public double calcularTotal(){
        double total = calcularSubtotal()-calcularDescuentoAudioguias();
        return total;

    }
    public void imprimirTicket(){
    System.out.printf("Precio adultos %10d €\n",this.entradasAdulto /*subtotalAdulto*/);   
    }
    //GETTERS
    public static double getDescuentoGuia(){
        return descuentoGuia;
    } 

    public static double getPrecioAdulto(){
        return precioAdulto;
    }
    public static double getPrecioNino(){
        return precioNino;
    }
    public static double getPrecioGuia(){
        return precioGuia;
    }
    public int getEntradasAdulto(){
        return entradasAdulto;
    }
    public int getEntradasNino(){
        return entradasNino;
    }
    public int getEntradasAudioguia(){
        return entradaAudioguia;
    }   
}