
public class PrácticaMonitor {

    //Atributos
    public double size;
    public double weight;
    public boolean isOn;

    /*public String color;
    public int refreshRate;
    public String brand;
    public int resolution;*/
    //Constructor
    public PrácticaMonitor(double size, double weight) {
        this.size = size;
        this.weight = weight;
        this.isOn = false;

    }

    public void on() {
        this.isOn = true;
    }

    public void off() {
        this.isOn = false;
    }

}
