public class count_subsequences_lessThan_product {
    public static int seq(int[] arr, int n, int idx, int p, int prod) {
        if (idx == n) {
            if (p <= prod)
                return 1;
            else
                return 0;
        }

        int l = seq(arr, n, idx + 1, p * arr[idx], prod);

        int r = seq(arr, n, idx + 1, p, prod);

        return l + r;
    }

    public static int countSubsequences(int[] a, int n, int prod) {
        return seq(a, n, 0, 1, prod) - 1;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int n = a.length;
        int prod = 10;
        int result = countSubsequences(a, n, prod);
        System.out.println(result);
    }
}
