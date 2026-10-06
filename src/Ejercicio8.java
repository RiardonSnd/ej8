public class Ejercicio8 {

    public static void main(String[] args) {
        int [][] coords;
        coords = new int[10][10];
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                coords[i][j] = 1;
            }
        }
        coords[0][4] = 8;
        coords[2][6] = 8;
        coords[3][1] = 8;
        coords[8][6] = 8;

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.print(coords[i][j] + " ");
            }
            System.out.println();
        }
    }
}

