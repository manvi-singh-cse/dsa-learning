public class reverse_array {
    public static void swap(int[] arr, int i, int n) {
        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;
    }

    public static void array_reversal(int[] arr, int i, int n) {
        if (i >= n) {
            return;
        }
        swap(arr, i, n);
        array_reversal(arr, i + 1, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        array_reversal(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
