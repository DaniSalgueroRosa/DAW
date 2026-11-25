public class Contactos {
    //Atributos
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int telefono;
    private String correo;


    //Constructor
    public Contactos(String nombre, String apellido1, String apellido2, int telefono, String correo){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.correo = correo;
    }

    
    //Esto es para imprimir la tarjeta
    @Override
    public String toString() {
        String tarjeta = this.nombre + " " + this.apellido1 + " " + this.apellido2 + "\n" + 
        this.telefono + "\n" + 
        this.correo;
        return tarjeta;
    }
    
}
