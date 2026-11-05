import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        Libro libro1 = new Libro("1984", "George Orwell", 1949);
        Libro libro2 = new Libro("El extranjero", "Albert Camus", 1942);
        Libro libro3 = new Libro("Romancero Gitano", "Federico García Lorca", 1928);

        Socio socio1 = new Socio("Lucía", 101, 1234);
        Socio socio2 = new Socio("Marcos", 102, 4321);

        System.out.println("Nombre: " + socio1.getNombre());
        System.out.println("Número: " + socio1.getNumeroSocio());
        System.out.println("Nombre: " + socio2.getNombre()); 
        System.out.println("Número: " + socio2.getNumeroSocio());
        

        public static

    }
}
