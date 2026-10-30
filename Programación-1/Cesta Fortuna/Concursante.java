public class Concursante {

    private String nombre;
    private int premioAcumulado;
    public static int   VALOR_BOLA_BLANCA = 100;
    public static int VALOR_BOLA_AZUL = 200;
    
    
    public Concursante (String Nombre) {
        this.nombre = nombre;
        this.premioAcumulado = 0;
    }
    
    public void sumarPremio(int cantidad){
        this.premioAcumulado += cantidad;
    }
    
    private void bancarrota(){
        this.premioAcumulado = 0;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getPremioAcumulado() {
        return premioAcumulado;
    }
    
    public void setPremioAcumulado(int premioAcumulado) {
        this.premioAcumulado = premioAcumulado;
    }
    
    public static int getVALOR_BOLA_BLANCA() {
        return VALOR_BOLA_BLANCA;
    }
    
    public static void setVALOR_BOLA_BLANCA(int VALOR_BOLA_BLANCA) {
        Concursante.VALOR_BOLA_BLANCA = VALOR_BOLA_BLANCA;
    }
    
    public static int getVALOR_BOLA_AZUL() {
        return VALOR_BOLA_AZUL;
    }
    
    public static void setVALOR_BOLA_AZUL(int VALOR_BOLA_AZUL) {
        Concursante.VALOR_BOLA_AZUL = VALOR_BOLA_AZUL;
    }
    
}

