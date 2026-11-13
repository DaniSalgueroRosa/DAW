public class Agenda {
    private Contact[] contacts;

    public Agenda(int size){
        this.contacts = new Contact[size];
        for (int i = 0 ; i < contacts.length; i++) {
            contacts[i]= null;
        }
    }
}
