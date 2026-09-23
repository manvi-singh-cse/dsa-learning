public class first_unique_char {
    public static char firstNonRepeating(String str) {
        int[] freq = new int[26];
        char[] strChar = str.toCharArray();

        for (char c : strChar) {
            freq[c - 'a']++;
        }

        for (char c : strChar) {
            if (freq[c - 'a'] == 1) {
                return c;
            }
        }

        return '#';
    }

    public static void main(String[] args) {
        String str = "leetcode";
        char result = firstNonRepeating(str);
        System.out.println("The first non-repeating character is: " + result);
    }
}
