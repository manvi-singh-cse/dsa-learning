public class nth_root_of_m {
    public static int NthRoot(int n, int m) {
        int low = 0;
        int high = m;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (Math.pow(mid, n) == m) {
                return mid;
            } else if (Math.pow(mid, n) > m) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 64;
        int result = NthRoot(n, m);
        if (result != -1) {
            System.out.println("The " + n + "th root of " + m + " is: " + result);
        } else {
            System.out.println("No integer " + n + "th root exists for " + m);
        }
    }
}
