import java.util.ArrayList;
import java.util.Collections;

public class subset_sum {
    public static void sums(int idx, int[] num, int sum, ArrayList<Integer> ans) {
        if (idx == num.length) {
            ans.add(sum);
            return;
        }
        sums(idx + 1, num, (sum + num[idx]), ans);
        sums(idx + 1, num, (sum), ans);
    }

    public static ArrayList<Integer> subsetSum(int num[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        sums(0, num, 0, ans);
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        ArrayList<Integer> result = subsetSum(arr);
        System.out.println(result);
    }
}
