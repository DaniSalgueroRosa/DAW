
public class arrays {

    public static void main(String[] args) {
        /*
        int[] numeros;
        numeros = new int[10];
        numeros[0]=1;
        numeros[1]=2;
        numeros[9]=10; 
         */

        int[] pares = new int[100]; //Iría hasta el 99 porque empieza en 0

        for (int i = 0; i < pares.length; i++) {
            pares[i] = (i + 1) * 2;
        }

        //Aspectos primitivos
        for (int numero : pares) {
            System.out.println(numero);
        }

    }
}
