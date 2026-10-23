import java.util.ArrayList;

public class allocate_books {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        if (n < m) {
            return -1;
        }

        int low = 0;
        int high = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > low) {
                low = arr.get(i);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            high = high + arr.get(i);
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int stuCount = noOfStudents(arr, mid, m);
            if (stuCount > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static int noOfStudents(ArrayList<Integer> arr, int mid, int m) {
        int pages = 0;
        int count = 1;
        for (int i = 0; i < arr.size(); i++) {
            if ((pages + arr.get(i)) <= mid) {
                pages = pages + arr.get(i);
            } else {
                count++;
                pages = arr.get(i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(34);
        arr.add(67);
        arr.add(90);
        int m = 3;
        int n = arr.size();
        System.out.println(findPages(arr, n, m));
    }
}
