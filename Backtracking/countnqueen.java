package Backtracking;

public class countnqueen {
    public static boolean issafe(char Chess[][], int row, int col) {

        // vertical up

        for (int i = row - 1; i >= 0; i--) {
            if (Chess[i][col] == 'Q') {
                return false;
            }
        }
        // diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (Chess[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < Chess.length; i--, j++) {
            if (Chess[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void Nqueen(char Chess[][], int row) {
        // base case
        if (row == Chess.length) {
            count++;
            return;
        }
        // column loop
        for (int j = 0; j < Chess.length; j++) {
            if (issafe(Chess, row, j)) {
                Chess[row][j] = 'Q';
                Nqueen(Chess, row + 1);
                Chess[row][j] = 'X';
            }
        }
    }

    public static void printnqueens(char Chess[][]) {

        System.out.println("-----------chess board-----------");
        for (int i = 0; i < Chess.length; i++) {
            for (int j = 0; j < Chess.length; j++) {
                System.out.print(Chess[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 5;
        char Chess[][] = new char[n][n];

        // initialize

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Chess[i][j] = 'X';

            }
        }
        Nqueen(Chess, 0);
        System.out.println("total count :" + count);
    }
}
