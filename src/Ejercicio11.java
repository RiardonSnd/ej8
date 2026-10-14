import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean gameOver = false;
        char[][] matrix;
        matrix = new char[8][8];
        int disparos = 0;
        int hundidos = 0;
        int numShips = 10;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = ' ';
            }
        }

        addShips(matrix);

        while (!gameOver) {
            printMatrix(matrix, false, disparos, hundidos);
            int row = getRow(input);
            int col = getCol(input);
            if (matrix[row][col] == 'S') {
                matrix[row][col] = 'X';
                hundidos++;
                numShips--;
            } else {
                matrix[row][col] = 'O';
            }
            disparos++;
            if (numShips <= 0) {
                System.out.println("You win.");
                gameOver = true;
            }
        }
    }
    static void printMatrix(char [][] matrix, boolean debug, int disparos, int hundidos) {
        System.out.println("Disparos: " +disparos);
        System.out.println("Hundidos: " +hundidos);
        System.out.print("  ");
        for (int i = 1; i <= 8; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(((char) (65 + i)) + " ");
            for (int j = 0; j < matrix[0].length; j++) {
                if (debug) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    if (matrix[i][j] == 'S') {
                        System.out.print("  ");
                    } else {
                        System.out.print(matrix[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void addShips(char[][] matrix) {
        int numShips = 0;
        while (numShips < 10) {
            int row = (int) (Math.random() * matrix.length);
            int col = (int) (Math.random() * matrix[0].length);
            if (matrix[row][col] != 'S') {
                matrix[row][col] = 'S';
                numShips++;
            }
        }
    }

    static int getRow(Scanner input) {
        System.out.print("Dame la letra de la fila: ");
        char letter = input.next().charAt(0);
        int row = letter - 65;
        return row;
    }
    static int getCol(Scanner input) {
        System.out.print("Dame el número de la columna: ");
        int col = input.nextInt() - 1;
        return col;
    }



}
