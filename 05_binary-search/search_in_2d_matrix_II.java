import java.util.ArrayList;

public class search_in_2d_matrix_II {
    public static boolean findInMatrix(int x, ArrayList<ArrayList<Integer>> arr) {
        int row = 0;
        int col = arr.get(0).size() - 1;

        while (row < arr.size() && col >= 0) {
            if (arr.get(row).get(col) == x) {
                return true;
            } else if (arr.get(row).get(col) < x) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(4);
        row1.add(5);
        arr.add(row1);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(3);
        row2.add(4);
        row2.add(9);
        row2.add(16);
        arr.add(row2);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(10);
        row3.add(14);
        row3.add(29);
        arr.add(row3);

        int target = 3;
        boolean result = findInMatrix(target, arr);
        System.out.println("Target " + target + " found: " + result);

        target = 13;
        result = findInMatrix(target, arr);
        System.out.println("Target " + target + " found: " + result);
    }
}
