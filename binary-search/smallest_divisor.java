public class smallest_divisor {
    public static int smallestDivisor(int arr[], int limit) {
        int low = 1;
        int high = arr[0];
        int ans = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > high) {
                high = arr[i];
            }
        }
        while (low < high) {
            int mid = (low + high) / 2;
            if (totalDivision(arr, mid, limit)) {
                ans = mid;
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static boolean totalDivision(int arr[], int mid, int limit) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + ((mid + arr[i] - 1) / mid);
            if (sum > limit) {
                return false;
            }
        }
        return sum <= limit;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 9 };
        int limit = 6;
        System.out.println(smallestDivisor(arr, limit));
    }
}
