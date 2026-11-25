public class Agenda {
    

    //Atributo
    private Contactos[] contacto;


    //constructor
    public Agenda(int tamaño){
        this.contacto = new Contactos[tamaño];

        //Esto hace que la agenda se instancie vacia
        for (int i = 0; i < this.contacto.length; i++) {
            contacto[i] = null;
        }
    }


    public boolean estaCompleta(){
        int index = 0;
        while (contacto[index] != null) {
            index++;
        }
        if (index < contacto.length) {
            return false;
        } else {
            return true;
        }
    }


    public int buscarPrimeraPosicionLibre(){
        int index = 0;
        while (index < contacto.length && contacto[index] != null) {
            index++;
        }

        if (index < contacto.length) {
            return index;

        } else {
            return -1;
        }
    }


    public void aniadirContacto(Contactos contacto){
        int posicion = buscarPrimeraPosicionLibre();
        if (posicion != -1) {
            this.contacto[posicion] = contacto;
        }
    }


    public void imprimirAgenda(){
        
    }

}
