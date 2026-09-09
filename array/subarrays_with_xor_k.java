import java.util.*;

public class subarrays_with_xor_k {
    public static int subarraysXor(ArrayList<Integer> arr, int x) {
        int count = 0;
        int xor = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i : arr) {
            xor = xor ^ i;
            int target = xor ^ x;
            if (map.containsKey(target)) {
                count = count + map.get(target);
                System.out.println("Found");
            }
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 2, 2, 6, 4));
        int x = 6;
        int result = subarraysXor(arr, x);
        System.out.println(result);
    }
}