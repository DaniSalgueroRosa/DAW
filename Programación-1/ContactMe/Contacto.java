
public class Contacto {

    private String nombre;

    private String apellido1;

    private String apellido2;

    private String numero;

    private String email;

    public Contacto(String apellido1, String apellido2, String email, String nombre, String numero) {
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.nombre = nombre;
        this.numero = numero;
    }

    @Override 
    public String toString(){
        String tarjeta = this.nombre + this.apellido1 + this.apellido2 + this.email + this.numero;
        return tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }


    

}
