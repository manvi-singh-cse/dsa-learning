public class missing_element {
    public static int missingNumber(int[] a, int N) {
        int original_sum = ((N * (N + 1)) / 2);
        int arr_sum = 0;
        for (int i = 0; i < a.length; i++) {
            arr_sum = arr_sum + a[i];
        }

        return (original_sum - arr_sum);
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        int N = a.length + 1;
        System.out.println("Missing number is: " + missingNumber(a, N));
    }
}