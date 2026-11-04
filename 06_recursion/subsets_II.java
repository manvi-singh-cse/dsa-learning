import java.util.ArrayList;
import java.util.Arrays;

public class subsets_II {
    public static void subsets(int idx, int[] num, int length, ArrayList<Integer> ds,
            ArrayList<ArrayList<Integer>> ans) {
        ans.add(new ArrayList<>(ds));

        for (int i = idx; i < length; i++) {
            if (i != idx && num[i] == num[i - 1]) {
                continue;
            }
            ds.add(num[i]);
            subsets(i + 1, num, length, ds, ans);
            ds.remove(ds.size() - 1);
        }
    }

    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        subsets(0, arr, n, new ArrayList<>(), ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2 };
        int n = arr.length;
        ArrayList<ArrayList<Integer>> result = uniqueSubsets(n, arr);
        System.out.println(result);
    }
}
