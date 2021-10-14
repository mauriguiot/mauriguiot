import java.util.Scanner;

public class Compl1_9 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String cadena = "";
        char[] Arraycadena;
        char caracter;
        int totalLetras = 0;
        System.out.println("Ingrese la palabra: ");
        cadena = str.nextLine();
        str.close();
        Arraycadena = cadena.toCharArray();
        for (int i = 0; i < Arraycadena.length; i++) {
            caracter = Arraycadena[i];
            for (int j = 0; j < Arraycadena.length; j++) {
                if (Arraycadena[j] == caracter) {
                    totalLetras++;
                }
            }
            System.out.println(Arraycadena[i] + " " + totalLetras);
            totalLetras = 0;
        }
    }

}
