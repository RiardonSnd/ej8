import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int dni;
        String letra;
        System.out.println("Introduzca el DNI sin letra: ");
        dni = input.nextInt();

        letra = array[dni % 23];

        System.out.println("El DNI completo es: " +dni+letra);
    }
}
