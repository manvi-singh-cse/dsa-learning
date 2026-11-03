import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination_sum {
    public static void newComb(int idx, int[] arr, int target, List<List<Integer>> ans, ArrayList<Integer> ds) {
        if (idx == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[idx] <= target) {
            ds.add(arr[idx]);
            newComb(idx, arr, (target - arr[idx]), ans, ds);
            ds.remove(ds.size() - 1);
        }
        newComb((idx + 1), arr, target, ans, ds);
    }

    public static List<List<Integer>> combSum(int[] ARR, int B) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(ARR);
        newComb(0, ARR, B, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 13, 3, 2, 17 };
        int target = 14;
        List<List<Integer>> result = combSum(arr, target);
        System.out.println(result);
    }
}
