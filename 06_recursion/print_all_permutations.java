import java.util.Arrays;

public class print_all_permutations {
    public static void permutations(char[] str, boolean[] mark, StringBuilder ds) {
        if (ds.length() == str.length) {
            System.out.println(ds.toString());
            return;
        }

        for (int i = 0; i < str.length; i++) {
            if (!mark[i]) {
                mark[i] = true;
                ds.append(str[i]);
                permutations(str, mark, ds);
                ds.deleteCharAt(ds.length() - 1);
                mark[i] = false;
            }
        }
    }

    public static void FindPermutations(String str) {
        char[] strArr = str.toCharArray();
        Arrays.sort(strArr);
        boolean[] mark = new boolean[strArr.length];
        permutations(strArr, mark, new StringBuilder());
    }

    public static void main(String[] args) {
        String str = "abc";
        FindPermutations(str);
    }
}
