import java.util.ArrayList;

public class search_in_2d_matrix {
    static boolean binarySearch(ArrayList<Integer> arr, int low, int high, int target) {
        if (low > high) {
            return false;
        }

        int mid = low + (high - low) / 2;

        if (arr.get(mid) == target) {
            return true;
        } else if (arr.get(mid) > target) {
            return binarySearch(arr, low, mid - 1, target);
        } else {
            return binarySearch(arr, mid + 1, high, target);
        }
    }

    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {

        int rows = mat.size();
        int cols = mat.get(0).size();

        if (rows == 0) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            if (cols == 0) {
                return false;
            }

            if (target >= mat.get(i).get(0) && target <= mat.get(i).get(cols - 1)) {
                return binarySearch(mat.get(i), 0, cols - 1, target);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(3);
        row1.add(5);
        row1.add(7);
        mat.add(row1);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(10);
        row2.add(11);
        row2.add(16);
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
