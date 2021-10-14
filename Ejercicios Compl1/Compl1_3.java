import java.util.Scanner;

public class Compl1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el número:");
        scan.close();
        int num1 = 1, linea;
        linea = scan.nextInt();
        while (num1 <= linea) {
            for (int j = 1; j <= num1; j++) {
                System.out.print(j);
            }
            System.out.println();
            num1++;
        }
    }
}
