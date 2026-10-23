import java.util.Arrays;

public class left_rotate_by_1 {
    static int[] rotateArray(int[] arr, int n) {
        int temp = arr[0];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = temp;
        return arr;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        System.out.println("Original array: " + Arrays.toString(arr));
        arr = rotateArray(arr, n);
        System.out.println("Array after left rotation by 1: " + Arrays.toString(arr));
    }
}
