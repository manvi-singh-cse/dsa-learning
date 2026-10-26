import java.util.ArrayList;

public class max_ones_in_row {
    public static int rowMaxOnes(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int index = -1;
        int max_count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum = sum + mat.get(i).get(j);
                if (sum > max_count) {
                    max_count = sum;
                    index = i;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(new ArrayList<>(java.util.Arrays.asList(0, 1, 1, 1)));
        mat.add(new ArrayList<>(java.util.Arrays.asList(0, 0, 1, 1)));
        mat.add(new ArrayList<>(java.util.Arrays.asList(1, 1, 1, 1)));
        mat.add(new ArrayList<>(java.util.Arrays.asList(0, 0, 0, 0)));

        int n = mat.size();
        int m = mat.get(0).size();

        int result = rowMaxOnes(mat, n, m);
        System.out.println("Row with maximum number of 1s: " + result);
    }
}
