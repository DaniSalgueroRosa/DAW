

public class Habitacion{
    private boolean cuadroRevisado=false;
    private boolean cajonRevisado=false;
    private boolean alfombraRevisada=false;

    private int pistaCuadro;
    private int pistaCajon;
    private int pistaAlfombra;

    public Habitacion(int pistaCuadro , int pistaCajon , int pistaAlfombra){
        this.pistaCuadro = this.pistaCuadro;
        this.pistaCajon = this.pistaCajon;
        this.pistaAlfombra = this.pistaAlfombra;
    }

    public void inspeccionarCuadro(){
        if (cuadroRevisado = false){
            cuadroRevisado = true; 
            System.out.println("Detrás del lienzo ves grabado el número " + pistaCuadro);
        }else{
            System.out.println("Ya has mirado, no hay nada más");
        }
    }

    public void inspeccionarCajon(){
        if (cajonRevisado = false){
            cajonRevisado = true;
            System.out.println("Al fondo del cajón has visto un paquete de pañuelos y un papel con el número " + pistaCajon);
        }else{
            System.out.println("Ya has mirado, vete a otro lado");
        }
    }


    public void inspeccionarAlfombra(){
        if(alfombraRevisada = false){
            alfombraRevisada = true;
            System.out.println("A parte de una cantidad indecente de polvo, has encontrado una marca en el suelo con el número " + pistaAlfombra);
        }else{
            System.out.println("Ya has mirado, tienes problemas de memoria eh");
        }
    }
}