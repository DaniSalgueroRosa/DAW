
import java.util.Random;

public class Cesta {

    private int bolasBlancas = 10;
    private int bolasAzules = 1;
    private int bolasNegras = 1;

    public Cesta(int bolasBlancas, int bolasAzules, int bolasNegras) {
        this.bolasBlancas = bolasBlancas;
        this.bolasAzules = bolasAzules;
        this.bolasNegras = bolasNegras;

    }

    public int obtenerTotalBolas() {
        int totalBolas = bolasBlancas + bolasAzules + bolasNegras;
        System.out.println("El número total de bolas es " + totalBolas);
        return totalBolas;
    }

    private static char extraerBola(int b, int a, int n) {
        Random rand = new Random();
        int totalBolas = b + a + n;
        if (totalBolas == 0) {
            return 'V';
        }
        int tirada = rand.nextInt(totalBolas) + 1;

        if (tirada <= b) {
            return 'B';
        } else if (tirada <= b + a) {
            return 'A';
        } else {
            return 'N';
        }

    }

    public int sacarBola() {
        return extraerBola(this.bolasAzules, this.bolasAzules, this.bolasNegras);

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
