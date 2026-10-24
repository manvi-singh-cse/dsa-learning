import java.util.ArrayList;

public class painters_problem {
    public static int noOfPainters(ArrayList<Integer> arr, int mid, int m) {
        int units = 0;
        int count = 1;
        for (int i = 0; i < arr.size(); i++) {
            if ((units + arr.get(i)) <= mid) {
                units = units + arr.get(i);
            } else {
                count++;
                units = arr.get(i);
            }
        }
        return count;
    }

    public static int findLargestMinDistance(ArrayList<Integer> boards, int k) {
        int n = boards.size();
        if (n < k) {
            return -1;
        }

        int low = 0;
        int high = 0;

        for (int i = 0; i < boards.size(); i++) {
            if (boards.get(i) > low) {
                low = boards.get(i);
            }
        }

        for (int i = 0; i < boards.size(); i++) {
            high = high + boards.get(i);
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int painterCount = noOfPainters(boards, mid, k);
            if (painterCount > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        ArrayList<Integer> boards = new ArrayList<>();
        boards.add(10);
        boards.add(20);
        boards.add(30);
        boards.add(40);
        int k = 2;
        int result = findLargestMinDistance(boards, k);
        System.out.println("The minimum time to paint all boards is: " + result);
    }
}
