public class square_root_of_n {
    public static int sqrtN(int N) {
        if (N == 0 || N == 1)
            return N;
        int low = 0;
        int high = N;
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            int sqVal = mid * mid;
            if (sqVal == N) {
                ans = mid;
                break;
            } else if (sqVal < N) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 36;
        System.out.println("The square root of " + N + " is: " + sqrtN(N));
    }
}