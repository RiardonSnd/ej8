import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1;
        int[] array2;
        array1 = new int[10];
        array2 = new int[10];

        System.out.println("Introduce 10 valores enteros: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextInt();
        }

        for(int i = 0; i <= 9; i++) {
            array2[i] = array1[9-i];
        }

        System.out.println("Orden inverso: ");
        for(int i = 0; i <= 9; i++) {
            System.out.println("Elemento índice " +i+ " = " + array2[i]);
        }
    }
}