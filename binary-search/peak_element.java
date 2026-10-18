import java.util.ArrayList;

public class peak_element {
    public static int findPeakElement(ArrayList<Integer> arr) {
        int n = arr.size();
        if (n == 1) {
            return arr.get(0);
        }
        if (arr.get(0) > arr.get(1)) {
            return arr.get(0);
        }
        if (arr.get(n - 1) > arr.get(n - 2)) {
            return arr.get(n - 1);
        }
        int low = 1;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) > arr.get(mid + 1) && arr.get(mid) > arr.get(mid - 1)) {
                return arr.get(mid);
            } else if (arr.get(mid) < arr.get(mid - 1)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(20);
        arr.add(4);
        arr.add(1);
        arr.add(0);
        arr.add(5);
        arr.add(4);
        arr.add(1);
        int peakVal = findPeakElement(arr);
        System.out.println("The peak element is: " + peakVal);
    }
}
