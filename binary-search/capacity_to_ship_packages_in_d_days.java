public class capacity_to_ship_packages_in_d_days {
    public static int leastWeightCapacity(int[] arr, int d) {
        int low = arr[0];
        int high = arr[0];
        int ans = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > low) {
                low = arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            high = high + arr[i];
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canShip(arr, mid, d)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static boolean canShip(int[] arr, int mid, int d) {
        int load = 0;
        int days = 1;
        for (int i = 0; i < arr.length; i++) {
            if (load + arr[i] <= mid) {
                load = load + arr[i];
            } else {
                days++;
                load = arr[i];
            }
            if (days > d) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 5, 2, 3, 4, 5, 6 };
        int d = 5;
        System.out.println(leastWeightCapacity(arr, d));
    }
}
