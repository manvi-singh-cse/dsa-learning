import java.util.ArrayList;

public class intersection_sorted_array {
    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n,
            ArrayList<Integer> arr2, int m) {

        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < n && j < m) {

            int a = arr1.get(i);
            int b = arr2.get(j);

            if (a < b) {
                i++;
            } else if (a > b) {
                j++;
            } else {
                result.add(a);
                i++;
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);

        ArrayList<Integer> intersection = findArrayIntersection(arr1, arr1.size(), arr2, arr2.size());
        System.out.println(intersection);
    }
}
