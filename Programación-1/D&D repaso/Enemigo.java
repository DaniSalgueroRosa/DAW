public class Enemigo{
   
    private String NombreEnemigo;
    private int VidaActualEnemigo; 
    private int VidaMaxEnemigo;
    private int DanoBaseEnemigo;
    
    boolean estaDerrotadoEnemigo = false;

    public Enemigo(int DanoBaseEnemigo, String NombreEnemigo, int VidaActuaEnemigol, int VidaMaxEnemigo) {
        this.DanoBaseEnemigo = DanoBaseEnemigo;
        this.NombreEnemigo = NombreEnemigo;
        this.VidaActualEnemigo = VidaActuaEnemigol;
        this.VidaMaxEnemigo = VidaMaxEnemigo;
    }
  
    public void recibirDano(int dano){
        VidaActualEnemigo = VidaActualEnemigo - dano;
        if(VidaActualEnemigo < 0){
            VidaActualEnemigo = 0;
        }
    }

    public boolean estaDerrotado(){
       return VidaActualEnemigo <= 0;
    }
    
    public void atacar(Aventurero aventurero){
        aventurero.recibirDano(DanoBaseEnemigo);
    }
   
   
   
    public String getNombreEnemigo() {
        return NombreEnemigo;
    }
    
    public void setNombreEnemigo(String nombreEnemigo) {
        NombreEnemigo = nombreEnemigo;
    }
    
    public int getVidaActualEnemigo() {
        return VidaActualEnemigo;
    }
    
    public void setVidaActualEnemigo(int vidaActualEnemigo) {
        VidaActualEnemigo = vidaActualEnemigo;
    }
    
    public int getVidaMaxEnemigo() {
        return VidaMaxEnemigo;
    }
    
    public void setVidaMaxEnemigo(int vidaMaxEnemigo) {
        VidaMaxEnemigo = vidaMaxEnemigo;
    }
    
    public int getDanoBaseEnemigo() {
        return DanoBaseEnemigo;
    }
    
    public void setDanoBaseEnemigo(int danoBaseEnemigo) {
        DanoBaseEnemigo = danoBaseEnemigo;
    }
}