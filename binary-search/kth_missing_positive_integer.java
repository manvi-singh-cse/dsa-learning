public class kth_missing_positive_integer {
    public static int missingK(int[] vec, int n, int k) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = vec[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (low + k);
    }

    public static void main(String[] args) {
        int vec[] = { 2, 3, 4, 7, 11 };
        int n = vec.length;
        int k = 5;
        System.out.println(k + "th missing value is " + missingK(vec, n, k));
    }
}
