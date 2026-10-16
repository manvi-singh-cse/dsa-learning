import java.util.ArrayList;

public class search_in_sorted_array {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        int idx = -1;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == k) {
                idx = mid;
                break;
            }
            if (arr.get(low) <= arr.get(mid)) {

                if (k >= arr.get(low) && k < arr.get(mid)) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            else {

                if (k > arr.get(mid) && k <= arr.get(high)) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        int n = arr.size();
        int k = 6;
        int result = search(arr, n, k);
        if (result == -1) {
            System.out.println(k + " is not present in the array.");
        } else {
            System.out.println("The index of the target value is: " + result);
        }
    }
}
