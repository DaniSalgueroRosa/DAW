public class Ejercicio1 {
    public static void main(String[] args) {
        int x=144;
        int y=999;
        int suma;
        int resta;
        int multiplicación;
        double división;

        suma= x + y;
        resta= x - y;
        multiplicación= x * y;
        división= (double) x / y;

        System.out.println("El resultado de la suma es: "+ suma);
        System.out.println("El resultado de la resta es: "+ resta);
        System.out.println("El resultado de la multiplicación es: "+ multiplicación);
        System.out.println("El resultado de la división es: "+ división);

        double resultadoreal = (double) x/y;
        System.out.printf("x + y = %d\n", x + y);
        System.out.printf("x - y = %d\n", x - y);
        System.out.printf("x * y = %d\n", x * y);
        System.out.printf ("x / y = %.5f\n", resultadoreal);

            }
}
