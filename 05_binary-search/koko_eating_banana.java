public class koko_eating_banana {
    public static boolean canFinish(int[] piles, int speed, int h) {
        long hours = 0;
        for (int pile : piles) {
            hours += (pile + speed - 1) / speed;
            if (hours > h) {
                return false;
            }
        }
        return hours <= h;
    }

    public static int minimumRateToEatBananas(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        while (low < high) {
            int mid = (low + high) / 2;
            if (canFinish(piles, mid, h)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };
        int h = 8;
        int result = minimumRateToEatBananas(piles, h);
        System.out.println("Minimum eating speed: " + result);
    }
}
