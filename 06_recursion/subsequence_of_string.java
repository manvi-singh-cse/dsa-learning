import java.util.ArrayList;

public class subsequence_of_string {
    public static void seq(ArrayList<Character> ds, char[] str, int n, int idx, ArrayList<String> ans) {
        if (idx >= n) {
            if (!ds.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (Character c : ds) {
                    sb.append(c);
                }
                ans.add(sb.toString());
            }
            return;
        }

        ds.add(str[idx]);
        seq(ds, str, n, idx + 1, ans);

        ds.remove(ds.size() - 1);
        seq(ds, str, n, idx + 1, ans);
    }

    public static ArrayList<String> subsequences(String str) {

        ArrayList<Character> ds = new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        seq(ds, str.toCharArray(), str.length(), 0, ans);
        return ans;
    }

    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> result = subsequences(str);
        System.out.println(result);
    }
}
