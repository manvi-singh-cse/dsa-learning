import java.util.Scanner;

public class reverse_vowels {
    public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0, j = sb.length() - 1;

        while (i < j) {
            if (isVowel(sb.charAt(i)) && isVowel(sb.charAt(j))) {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            } else if (!isVowel(sb.charAt(i))) {
                i++;
            } else {
                j--;
            }
        }
        return sb.toString();
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String result = reverseVowels(s);
        System.out.println(result);
    }
}
