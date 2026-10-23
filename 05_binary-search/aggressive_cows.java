import java.util.Arrays;

public class aggressive_cows {
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canPlace(stalls, mid, k)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    public static boolean canPlace(int[] stalls, int mid, int k) {
        int count = 1;
        int lastPosition = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= mid) {
                count++;
                lastPosition = stalls[i];
            }
            if (count >= k) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] stalls = { 1, 2, 4, 8, 9, 10, 12 };
        int k = 3;
        System.out.println(
                "Maximum of the lowest distance between 2 cows to place " + k + " cows is "
                        + aggressiveCows(stalls, k));
    }
}
