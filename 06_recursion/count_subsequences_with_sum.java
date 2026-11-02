public class count_subsequences_with_sum {
    public static int seq(int[] arr, int n, int idx, int s, int sum) {
        if (idx == n) {
            if (s == sum)
                return 1;
            else
                return 0;
        }

        int l = seq(arr, n, idx + 1, s + arr[idx], sum);

        int r = seq(arr, n, idx + 1, s, sum);

        return l + r;
    }

    public static int countSubsequences(int[] a, int n, int sum) {
        return seq(a, n, 0, 0, sum);
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 2, 5 };
        int n = a.length;
        int sum = 7;
        int result = countSubsequences(a, n, sum);
        System.out.println(result);
    }
}
