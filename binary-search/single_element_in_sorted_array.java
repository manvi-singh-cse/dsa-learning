import java.util.ArrayList;

public class single_element_in_sorted_array {
    public static int singleNonDuplicate(ArrayList<Integer> arr) {

        int n = arr.size();

        if (n == 1)
            return arr.get(0);

        if (arr.get(0) != arr.get(1))
            return arr.get(0);

        if (arr.get(n - 1) != arr.get(n - 2))
            return arr.get(n - 1);

        int low = 1, high = n - 2;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr.get(mid) != arr.get(mid - 1) && arr.get(mid) != arr.get(mid + 1)) {
                return arr.get(mid);
            }

            if ((mid % 2 == 0 && arr.get(mid).equals(arr.get(mid + 1))) ||
                    (mid % 2 == 1 && arr.get(mid).equals(arr.get(mid - 1)))) {

                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(8);
        arr.add(8);

        int result = singleNonDuplicate(arr);
        System.out.println("The single non-duplicate element is: " + result);
    }
}
