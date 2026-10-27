import java.util.ArrayList;

public class max_ones_in_row {
    public static int floorSearch(ArrayList<Integer> arr, int X, int n) {
        int low = 0;
        int high = n - 1;
        int index = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr.get(mid) >= X) {
                index = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return index;
    }

    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int index = -1;
        int max_count = 0;

        for (int i = 0; i < n; i++) {
            int count = m - floorSearch(mat.get(i), 1, m);
            if (count > max_count) {
                max_count = count;
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(new ArrayList<>(java.util.Arrays.asList(0, 0, 1, 1)));
        mat.add(new ArrayList<>(java.util.Arrays.asList(0, 1, 1, 1)));
        mat.add(new ArrayList<>(java.util.Arrays.asList(0, 0, 1, 1)));
        mat.add(new ArrayList<>(java.util.Arrays.asList(0, 0, 0, 0)));

        // mat.add(new ArrayList<>(java.util.Arrays.asList(0, 0, 0, 0)));
        // mat.add(new ArrayList<>(java.util.Arrays.asList(0, 0, 0, 0)));
        // mat.add(new ArrayList<>(java.util.Arrays.asList(0, 0, 0, 0)));
        // mat.add(new ArrayList<>(java.util.Arrays.asList(0, 0, 0, 0)));

        int n = mat.size();
        int m = mat.get(0).size();

        int result = maximumOnesRow(mat, n, m);
        System.out.println("Row with maximum number of 1s: " + result);
    }
}
