public class Ejercicio9 {

    public static void main(String[] args) {
        int[][] coords;
        coords = new int[10][10];
        int contFilas = 0;
        int contCols = 0;
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

        boolean ones = false;
        for (int i = 0; i < coords.length; i++) {
            ones = true;
            for (int j = 0; j < coords.length; j++) {
                if (coords[i][j] != 1) {
                    ones = false;
                    break;
                }
            }
            if (ones) {
                contFilas++;
            }
        }
        for (int j = 0; j < coords[0].length; j++) {
            ones = true;
            for (int i = 0; i < coords.length; i++) {
                if (coords[i][j] != 1) {
                    ones = false;
                    break;
                }
            }
            if (ones) {
                contCols++;
            }
        }
    System.out.println("Number of rows: " + contFilas);
    System.out.println("Number of columns: " + contCols);
    }
}


