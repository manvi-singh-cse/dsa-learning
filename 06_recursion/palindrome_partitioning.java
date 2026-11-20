import java.util.ArrayList;
import java.util.List;

public class palindrome_partitioning {
    public static boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

    public static void solve(int index, String s, List<List<String>> ans, List<String> path) {
        if (index == s.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                path.add(s.substring(index, i + 1));
                solve(i + 1, s, ans, path);
                path.remove(path.size() - 1);
            }
        }
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        solve(0, s, ans, path);
        return ans;
    }

    public static void main(String[] args) {
        String s = "baab";
        List<List<String>> ans = partition(s);
        for (List<String> list : ans) {
            System.out.println(list);
        }
    }
}
