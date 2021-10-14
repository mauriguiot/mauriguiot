import java.util.Scanner;

public class Compl1_1 {

    public static void main(String[] args) {
        System.out.println("Por favor introduzca su nombre y apellido: ");
        String ingresarDatos = "";
        Scanner entradaEscaner = new Scanner(System.in);
        entradaEscaner.close();
        ingresarDatos = entradaEscaner.nextLine();
        System.out.println("Hola: \"" + ingresarDatos + "\"");
    }
}
