
import java.util.Scanner;

public class Pirámide1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura;
        char relleno;
        System.out.print("Introduzca la que desea que sea la altura de su pirámide: ");
        altura = scanner.nextInt();
        System.out.print("Introduzca el carácter de relleno de su pirámide: ");
        relleno = scanner.next().charAt(0);

        for (int i = 0; i < altura; i++){
            for (int a = altura ; a > i ; a--){
            System.out.print("  ");
            }
        for (int b = 0; b <= i *2; b++){
            System.out.print(relleno);
        }
        System.out.println();
        }
    }
}
