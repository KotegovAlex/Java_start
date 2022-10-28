package homeWork3;

import java.util.Arrays;

public class HorseMove {
    public static final int N = 5;
    static int k = 0;
    public static int[][] board;
    public static int[][] steps = {{2, 1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}, {2, -1}};
    public static int size;

    public static void solveHorseMove(int n) {
        size = n * n;
        board = new int[n][n];
        backTrack(0, 0, 1);
    }

    private static void backTrack(int rowStart, int colStart, int count) {

        board[rowStart][colStart] = count;

        if (count == size) {
            print();
            board[rowStart][colStart] = 0;
            return;
        }

        for (int s = 0; s < 8; s++) {

            int newRow = rowStart + steps[s][0];
            int newCol = colStart + steps[s][1];

            if (canPlace(newRow, newCol)) {
                backTrack(newRow, newCol, count + 1);
            }
        }
        board[rowStart][colStart] = 0;
    }

    public static boolean canPlace(int i, int j) {
        if ((i < 0 || j < 0 || i >= N || j >= N || board[i][j] != 0)) return false;
        return true;
    }

    private static void print() {
        System.out.println("Case " + ++k);
        for (var r : board) {
            System.out.println(Arrays.toString(r));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        solveHorseMove(N);
    }
}
