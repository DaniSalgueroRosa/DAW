public class Libro {
   private String titulo;
   private String autor;
   private int anioPublicacion;
   private boolean disponible = true;
   private int vecesPrestado = 0; 

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.disponible = true;
        this.vecesPrestado = 0;
    }

    public void mostrarInfo() {
        System.out.println("El nombre del libro es " + this.titulo);
        System.out.println("El autor del libro es " + this.autor);
        System.out.println("El libro de sacó en el año " + this.anioPublicacion);
        System.out.println("El libro actualmente se encuentra " + this.disponible);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getVecesPrestado() {
        return vecesPrestado;
    }

    public void setVecesPrestado(int vecesPrestado) {
        this.vecesPrestado = vecesPrestado;
    }
    

}