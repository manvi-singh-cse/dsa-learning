import java.util.ArrayList;

public class search_in_2d_matrix {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {

        int rows = mat.size();
        int cols = mat.get(0).size();

        if (rows == 0) {
            return false;
        }

        int low = 0;
        int high = (rows * cols) - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / cols;
            int col = mid % cols;

            if (mat.get(row).get(col) == target) {
                return true;
            } else if (mat.get(row).get(col) < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(5);
        row1.add(7);
        mat.add(row1);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(10);
        row2.add(11);
        row2.add(13);
        row2.add(20);
        mat.add(row2);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(23);
        row3.add(30);
        row3.add(34);
        row3.add(60);
        mat.add(row3);

        int target = 3;
        boolean result = searchMatrix(mat, target);
        System.out.println("Target " + target + " found: " + result);

        target = 13;
        result = searchMatrix(mat, target);
        System.out.println("Target " + target + " found: " + result);
    }
}
