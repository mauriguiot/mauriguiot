import java.util.Scanner;

public class Compl1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int num1 = scan.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = scan.nextInt();
        scan.close();
        int resultado;

        resultado = num1 + num2;
        System.out.println("Sumar " + num1 + " + " + num2 + " = " + resultado);
        resultado = num1 - num2;
        System.out.println("Restar " + num1 + " - " + num2 + " = " + resultado);
        resultado = num1 * num2;
        System.out.println("Multiplicar " + num1 + " * " + num2 + " = " + resultado);
        resultado = num1 / num2;
        System.out.println("Dividir " + num1 + " / " + num2 + " = " + resultado);

    }
}
