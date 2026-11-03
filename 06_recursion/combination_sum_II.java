import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination_sum_II {
    public static void newComb(int idx, int[] arr, int target, List<List<Integer>> ans, ArrayList<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1])
                continue;
            if (arr[i] > target)
                break;
            ds.add(arr[i]);
            newComb((i + 1), arr, (target - arr[i]), ans, ds);
            ds.remove(ds.size() - 1);
        }
    }

    public static List<List<Integer>> combSum(int[] ARR, int B) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(ARR);
        newComb(0, ARR, B, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2 };
        int target = 4;
        List<List<Integer>> result = combSum(arr, target);
        System.out.println(result);
    }
}
