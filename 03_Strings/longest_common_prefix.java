public class longest_common_prefix {
    public static String longestCommonPrefix(String[] arr, int n) {
        if (n == 0)
            return "";

        String prefix = arr[0];

        for (int i = 1; i < n; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] arr = { "flower", "flow", "float" };
        int n = arr.length;

        String result = longestCommonPrefix(arr, n);
        System.out.println(result);
    }
}
