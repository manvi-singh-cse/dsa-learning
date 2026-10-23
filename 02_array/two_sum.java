import java.util.*;

public class two_sum {
    public static int[][] twoSum(int[] arr, int target) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            int complement = target - num;

            if (freq.getOrDefault(num, 0) == 0)
                continue;

            if (num == complement && freq.get(num) >= 2) {
                result.add(new int[] { num, complement });
                freq.put(num, freq.get(num) - 2);
            } else if (freq.getOrDefault(complement, 0) > 0) {
                result.add(new int[] { num, complement });
                freq.put(num, freq.get(num) - 1);
                freq.put(complement, freq.get(complement) - 1);
            }
        }

        if (result.isEmpty()) {
            return new int[][] { { -1, -1 } };
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15, 3, 6, 4, 5 };
        int target = 9;

        int[][] ans = twoSum(arr, target);
        for (int[] pair : ans) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}