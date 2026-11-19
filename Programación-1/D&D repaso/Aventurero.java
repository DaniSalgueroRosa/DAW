public  class Aventurero {
    private String NombreAventurero;
    private int VidaActualAventurero;
    private int VidaMaximaAventurero;
    private int DanoBaseAventurero;
    private int CantidadPociones;
    private final static int Curacion = 20;
    public boolean estaCaido = false;
    
    public Aventurero(String nombreAventurero, int vidaActualAventurero, int vidaMaximaAventurero,
        int danoBaseAventurero, int cantidadPociones) {
            NombreAventurero = nombreAventurero;
            VidaActualAventurero = vidaActualAventurero;
            VidaMaximaAventurero = vidaMaximaAventurero;
            DanoBaseAventurero = danoBaseAventurero;
            CantidadPociones = cantidadPociones;
        }
        
    public void atacar (Enemigo enemigo){
        enemigo.recibirDano(DanoBaseAventurero);
    }
        
    public void beberPocion(){
        VidaActualAventurero = VidaActualAventurero + Curacion;
        if(VidaActualAventurero >=VidaMaximaAventurero){
            VidaActualAventurero = VidaMaximaAventurero;
        }
        CantidadPociones--;
    }

    public void recibirDano(int dano){
        VidaActualAventurero = VidaActualAventurero - dano;
        if(VidaActualAventurero <= 0){
            VidaActualAventurero = 0;
        }
    }

    public void estaCaido(){
        if(VidaActualAventurero <= 0){
            estaCaido = true;
        }
    }
      
        
        public String getNombreAventurero() {
            return NombreAventurero;
        }
    
        public void setNombreAventurero(String nombreAventurero) {
            NombreAventurero = nombreAventurero;
        }
    
        public int getVidaActualAventurero() {
            return VidaActualAventurero;
        }
    
        public void setVidaActualAventurero(int vidaActualAventurero) {
            VidaActualAventurero = vidaActualAventurero;
        }
    
        public int getVidaMaximaAventurero() {
            return VidaMaximaAventurero;
        }
    
        public void setVidaMaximaAventurero(int vidaMaximaAventurero) {
            VidaMaximaAventurero = vidaMaximaAventurero;
        }
    
        public int getDanoBaseAventurero() {
            return DanoBaseAventurero;
        }
    
        public void setDanoBaseAventurero(int danoBaseAventurero) {
            DanoBaseAventurero = danoBaseAventurero;
        }
    
        public int getCantidadPociones() {
            return CantidadPociones;
        }
    
        public void setCantidadPociones(int cantidadPociones) {
            CantidadPociones = cantidadPociones;
        }
    
    
}
