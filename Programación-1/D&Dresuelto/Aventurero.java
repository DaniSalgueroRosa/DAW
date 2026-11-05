
public class Aventurero {
    private static int curacion = 20;
    private String nombre;
    private int vidaMaxima;
    private int vidaActual;
    private int danioBase;
    private int cantidadPociones;

    public Aventurero (String nombre, int vidaMaxima, int danioBase){
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.vidaActual = vidaActual;
        this.danioBase = danioBase;
        this.cantidadPociones = cantidadPociones;
    }
    public boolean estaCaido(){
        return vidaActual <= 0;
    }
    public void atacar (Enemigo enemigo){
        enemigo.recibirDanio(danioBase);
    }
     
    public void beberPocion(){
        if (cantidadPociones >0){
            if (vidaActual + curacion > vidaMaxima){
                vidaActual = vidaMaxima;
            } else{
                vidaActual += curacion;
            }
            cantidadPociones--;
        }
    }
    public void recibirDanio (int danio){
        if (danio > vidaActual){
            vidaActual =0;
        }
        else {
            
        }
    }
}
