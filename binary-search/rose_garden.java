public class rose_garden {
    private static boolean possible(int[] arr, int day, int m, int k) {
        int cnt = 0;
        int bouquets = 0;
        for (int bloom : arr) {
            if (bloom <= day) {
                cnt++;
            } else {
                bouquets += cnt / k;
                cnt = 0;
            }
        }
        bouquets += cnt / k;
        return bouquets >= m;
    }

    public static int roseGarden(int[] arr, int k, int m) {
        int n = arr.length;
        if ((long) k * m > n) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int x : arr) {
            low = Math.min(low, x);
            high = Math.max(high, x);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(arr, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 10, 3, 10, 2 };
        int k = 3;
        int m = 2;
        int result = roseGarden(arr, k, m);
        if (result == -1) {
            System.out.println("Not possible to make bouquets");
        } else {
            System.out.println("Minimum day to make bouquets: " + result);
        }
    }
}
