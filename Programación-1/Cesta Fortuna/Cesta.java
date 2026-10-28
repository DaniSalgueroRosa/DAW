
import javax.sound.sampled.SourceDataLine;


public class Cesta {
    private int bolasBlancas = 10;
    private int bolasAzules = 1;
    private int bolasNegras = 1;


public Cesta (int bolasBlancas , int bolasAzules , int bolasNegras) {
    this.bolasBlancas = bolasBlancas;
    this.bolasAzules = bolasAzules;
    this.bolasNegras = bolasNegras;

}
/*public int obtenerTotalBolas(){
    int totalBolas = 0;
    int totalBolas = bolasBlancas + bolasAzules + bolasNegras;
    System.out.println("El número total de bolas es " + totalBolas);
    return totalBolas;

} */
private static char extraerBola (int bolasBlancas , int bolasAzules , int bolasNegras) {
    Random rand = new Random();
    int totalBolas = bolasBlancas + bolasAzules + bolasNegras;
    if (totalBolas == 0) return "V";

}   

    public int getBolasBlancas() {
        return bolasBlancas;
    }

    public void setBolasBlancas(int bolasBlancas) {
        this.bolasBlancas = bolasBlancas;
    }

    public int getBolasAzules() {
        return bolasAzules;
    }

    public void setBolasAzules(int bolasAzules) {
        this.bolasAzules = bolasAzules;
    }

    public int getBolasNegras() {
        return bolasNegras;
    }

    public void setBolasNegras(int bolasNegras) {
        this.bolasNegras = bolasNegras;
    }
}