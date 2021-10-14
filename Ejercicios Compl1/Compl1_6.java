import java.util.Scanner;

public class Compl1_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int num1 = scan.nextInt();
        System.out.println("Ingrese la potencia:");
        int num2 = scan.nextInt();
        scan.close();
        System.out.print(num1 + " elevado a  " + num2 + " es " + Numero_elevado(num1, num2));
    }

    public static int Numero_elevado(int num1, int num2) {
        int resultado = 1;
        for (int i = 1; i <= num2; i++) {
            resultado = resultado * num1;
        }
        return resultado;
    }
}
