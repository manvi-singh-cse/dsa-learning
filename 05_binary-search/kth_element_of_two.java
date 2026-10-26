public class kth_element_of_two {
    public static int ninjaAndLadoos(int row1[], int row2[], int m, int n, int k) {
        if (m > n) {
            return ninjaAndLadoos(row2, row1, n, m, k);
        }

        int low = Math.max(0, k - n);
        int high = Math.min(k, m);

        while (low <= high) {
            int cut1 = low + (high - low) / 2;
            int cut2 = k - cut1;

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : row1[cut1 - 1];
            int right1 = (cut1 == m) ? Integer.MAX_VALUE : row1[cut1];

            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : row2[cut2 - 1];
            int right2 = (cut2 == n) ? Integer.MAX_VALUE : row2[cut2];

            if (left1 <= right2 && left2 <= right1) {
                return Math.max(left1, left2);
            } else if (left1 > right2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int row1[] = { 2, 3, 6, 7, 9 };
        int row2[] = { 1, 4, 8, 10 };
        int m = row1.length;
        int n = row2.length;
        int k = 5;
        System.out.println("The " + k + "th element is: " + ninjaAndLadoos(row1, row2, m, n, k));
    }
}
