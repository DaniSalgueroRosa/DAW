public class Socio {
    private String nombre;
    private int numeroSocio;
    private int contrasena;
    private int librosPrestados = 0;
    private final static int maxPrestamos = 2;

    public Socio(String nombre, int numeroSocio, int contrasena) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
        this.contrasena = contrasena;   
    }
    public boolean comprobarContrasena (int pin){
        return this.contrasena == pin;
    }

    public boolean puedePedir(){
        return this.librosPrestados == maxPrestamos;
    }

    public void pedirLibro (Libro libro){
        
    }

    public void mostrarDatos(){
        System.out.println("El nombre del socio " + this.numeroSocio + " es " + this.nombre );
        System.out.println("Tiene un total de " + this.librosPrestados);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public int getContrasena() {
        return contrasena;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(int librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

}

