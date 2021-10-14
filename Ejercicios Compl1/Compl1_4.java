import java.util.Scanner;

public class Compl1_4 {
    public static void main(String[] args) {
        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num = scan.nextInt();
        scan.close();
        System.out.println("El factorial  de " + num + " es " + factorial(num));
    }

    public static int factorial(int numero) {
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
}