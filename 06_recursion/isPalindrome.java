public class isPalindrome {
    public static boolean palindrome_check(String str, int i, int n) {
        if (i >= n) {
            return true;
        }
        if (str.charAt(i) != str.charAt(n)) {
            return false;
        }
        palindrome_check(str, i + 1, n - 1);
        return true;
    }

    public static void main(String[] args) {
        String str = "Madam";
        int n = str.length();
        boolean result = palindrome_check(str.toLowerCase(), 0, n - 1);
        if (result == true) {
            System.out.print("String is palindrome");
        } else {
            System.out.print("String is not palindrome");
        }
    }
}
