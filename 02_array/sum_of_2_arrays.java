import java.util.Arrays;

public class sum_of_2_arrays {
    public static int[] findArraySum(int[] a, int n, int[] b, int m) {
        int num1 = 0;
        int num2 = 0;
        for (int nums : a) {
            num1 = (num1 * 10) + nums;
        }
        for (int nums : b) {
            num2 = (num2 * 10) + nums;
        }
        int sum = num1 + num2;
        int[] result = new int[Math.max(n + 1, m + 1)];
        int idx = result.length - 1;
        while (sum > 0 && idx >= 0) {
            result[idx] = sum % 10;
            sum /= 10;
            idx--;
        }
        int start = 0;
        while (start < result.length - 1 && result[start] == 0) {
            start++;
        }
        return Arrays.copyOfRange(result, start, result.length);
    }

    public static void main(String[] args) {
        int[] a = { 9, 9, 9 };
        int[] b = { 2, 3, 4 };
        int n = a.length;
        int m = b.length;
        int[] result = findArraySum(a, n, b, m);
        System.out.println(Arrays.toString(result));
    }
}