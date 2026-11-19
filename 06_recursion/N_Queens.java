import java.util.ArrayList;
import java.util.Collections;

public class N_Queens {
    public static boolean isSafe(int row, int col, ArrayList<ArrayList<Integer>> board, int n) {
        int duprow = row;
        int dupcol = col;

        // Upper-left diagonal
        while (row >= 0 && col >= 0) {
            if (board.get(row).get(col) == 1) {
                return false;
            }
            row--;
            col--;
        }

        // Same row, left side
        row = duprow;
        col = dupcol;

        while (col >= 0) {
            if (board.get(row).get(col) == 1) {
                return false;
            }
            col--;
        }

        // Lower-left diagonal
        row = duprow;
        col = dupcol;

        while (row < n && col >= 0) {
            if (board.get(row).get(col) == 1) {
                return false;
            }
            row++;
            col--;
        }
        return true;
    }

    public static void solve(int col, ArrayList<ArrayList<Integer>> board, ArrayList<ArrayList<Integer>> ans, int n) {
        if (col == n) {
            ArrayList<Integer> solution = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    solution.add(board.get(i).get(j));
                }
            }
            ans.add(solution);
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board, n)) {
                board.get(row).set(col, 1);
                solve(col + 1, board, ans, n);
                board.get(row).set(col, 0);
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            board.add(new ArrayList<>(Collections.nCopies(n, 0)));
        }
        solve(0, board, ans, n);
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer>> solutions = solveNQueens(n);
        System.out.println("Number of solutions for " + n + "-Queens: " + solutions.size());
        for (ArrayList<Integer> solution : solutions) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(solution.get(i * n + j) + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}