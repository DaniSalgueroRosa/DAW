public class CajaFuerte{
    private int codigoSecreto;
    private int intentosRestantes;
    private boolean estaAbierta;

    public CajaFuerte(int codigoSecreto, int intentosRestantes , boolean estaAbierta) {
        this.codigoSecreto = codigoSecreto;
        this.intentosRestantes = intentosRestantes;
        this.estaAbierta = false;
    }

    public void intentarAbrir(int combinacion) {
       if (intentosRestantes <= 0){
            System.out.println("Te has quedado sin intentos");
       }else if(combinacion == codigoSecreto){
         estaAbierta = true;
         
       }else{
        intentosRestantes--;
        System.out.println("Has fallado. Te quedan " + intentosRestantes + "intentos");
       }
    }

    public boolean bloqueada() {
       return intentosRestantes <= 0;
    }   

    //GETTERS
    public boolean estaAbierta(){
        return estaAbierta;
    }

    public int getIntentosRestantes(){
        return intentosRestantes;}
}