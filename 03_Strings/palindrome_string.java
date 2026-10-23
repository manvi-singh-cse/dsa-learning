import java.util.Scanner;

public class palindrome_string {
    public static boolean checkPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int j = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            j++;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        boolean isPalindrome = checkPalindrome(str);
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
        sc.close();
    }
}
