import java.util.*;

public class longest_consecutive_sequence {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int max = 0;

        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 100, 101, 102, 103, 104, 105, 4, 5, 6, 7, 200, 1, 3, 2 };
        int N = arr.length;
        int result = lengthOfLongestConsecutiveSequence(arr, N);
        System.out.println("Length of the longest consecutive sequence: " + result);
    }
}