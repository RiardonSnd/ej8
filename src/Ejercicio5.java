import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        array = new int[10];

        System.out.println("Introduce 10 valores enteros: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Orden inverso: ");
        for(int i = 9; i >= 0; i--) {
            System.out.println("Elemento índice " +i+ " = " + array[i]);
        }
    }
}