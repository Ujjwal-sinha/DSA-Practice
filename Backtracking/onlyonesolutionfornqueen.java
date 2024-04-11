package Backtracking;

public class onlyonesolutionfornqueen {
    public static boolean issafe(char chess[][], int row, int col) {

        // vertical up

        for (int i = row - 1; i >= 0; i--) {
            if (chess[i][col] == 'Q') {
                return false;
            }
        }
        // diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean nqueen(char chess[][], int row) {

        // base case
        if (row == chess.length) {

            return true;
        }
        for (int j = 0; j < chess.length; j++) {
            if (issafe(chess, row, j)) {
                chess[row][j] = 'Q';
                if (nqueen(chess, row + 1)) {
                    return true;

                }
                chess[row][j] = 'X';

            }
        }
        return false;
    }

    public static void print(char chess[][]) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                System.out.print(chess[i][j] + "");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char chess[][] = new char[n][n];
        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j] = 'X';

            }
        }
        if (nqueen(chess, 0)) {
            System.out.println("the solution is possible");
            print(chess);
        } else {
            System.out.println("not possible");
        }
    }
}
