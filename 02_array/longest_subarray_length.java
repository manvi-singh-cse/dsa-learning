import java.util.*;
import java.io.*;

public class longest_subarray_length {
    public static int getLongestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (map.containsKey(sum - k)) {
                int length = i - map.get(sum - k);
                maxLength = Math.max(maxLength, length);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLength;
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of target: ");
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }
        System.out.println(getLongestSubarray(nums, k));
        sc.close();
    }
}