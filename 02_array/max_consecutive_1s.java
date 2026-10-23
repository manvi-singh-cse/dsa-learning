public class max_consecutive_1s {
    public static int consecutiveOnes(int n, int[] arr) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                if (max < count) {
                    max++;
                }
            } else if (arr[i] == 0) {
                count = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1, 1, 0, 1, 1 };
        int n = arr.length;
        System.out.println(consecutiveOnes(n, arr));
    }
}
