import java.util.ArrayList;

public class rotate_matrix_90deg {
    public static ArrayList<ArrayList<Integer>> rotateMatrix(ArrayList<ArrayList<Integer>> matrix) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = matrix.size();
        int m = matrix.get(0).size();

        for (int j = m - 1; j >= 0; j--) {
            ArrayList<Integer> newRow = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                newRow.add(matrix.get(i).get(j));
            }
            result.add(newRow);
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(java.util.Arrays.asList(1, 2, 3)));
        matrix.add(new ArrayList<>(java.util.Arrays.asList(4, 5, 6)));
        matrix.add(new ArrayList<>(java.util.Arrays.asList(7, 8, 9)));

        ArrayList<ArrayList<Integer>> rotatedMatrix = rotateMatrix(matrix);

        for (ArrayList<Integer> row : rotatedMatrix) {
            for (Integer val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
