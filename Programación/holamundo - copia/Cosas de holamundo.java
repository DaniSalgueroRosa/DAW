public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\033[0m Hola Mundo"); //esto es para colores \033[Nºcolorm
        System.out.print("\033[0mSalto de línea \n");
     System.out.print("\033[0m Sin salto de línea ");
     // esto es un comentario
     /*Comentario
     multilinea */
     System.out.printf("El profesor tiene %d años\n",46); //un dato
     System.out.printf("Ha nacido en %-10s y se crio en %10s\n","Málaga","Estepona"); //dos datos
    System.out.printf("Y vive a %2.3f kilometros de distancia",14.949348397); //redondear/cortar
    System.out.println("\"Asi se pueden imprimir comillas dobles\"");
    System.out.println("Asi se pueden escribir cosas con unicode \u20A4");
    }
}
