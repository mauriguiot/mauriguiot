import java.util.Scanner;

public class Compl1_8 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        String nombreApellido, direccion, ciudad;
        int edad;

        System.out.println("Ingrese su Nombre y Apellido: ");

        nombreApellido = str.nextLine();

        System.out.println("Ingrese su edad: ");

        edad = num.nextInt();

        System.out.println("Ingrese su Direccion: ");

        direccion = str.nextLine();

        System.out.println("Ingrese su Ciudad: ");

        ciudad = str.nextLine();

        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombreApellido);

        str.close();
        num.close();

    }
}