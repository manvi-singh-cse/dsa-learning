public class sudoku {
    public static boolean solve(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                if (sudoku[i][j] == 0) {
                    for (int k = 1; k <= 9; k++) {
                        if (isValid(sudoku, i, j, k) == true) {
                            sudoku[i][j] = k;

                            if (solve(sudoku) == true) {
                                return true;
                            } else {
                                sudoku[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid(int[][] sudoku, int row, int col, int k) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == k) {
                return false;
            }
            if (sudoku[i][col] == k) {
                return false;
            }
            if (sudoku[((3 * (row / 3)) + (i / 3))][((3 * (col / 3)) + (i % 3))] == k) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] sudoku = {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };

        if (solve(sudoku) == true) {
            for (int i = 0; i < sudoku.length; i++) {
                for (int j = 0; j < sudoku[0].length; j++) {
                    System.out.print(sudoku[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists");
        }
    }
}
