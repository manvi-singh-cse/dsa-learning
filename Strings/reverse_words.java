import java.util.*;

public class reverse_words {
    public static String reverseString(String str) {
        String result = "";
        if (str != "") {
            str = str.trim();
            String[] words = str.split("\\s+");
            result = words[words.length - 1];
            for (int i = (words.length - 2); i >= 0; i--) {
                result = result + " " + words[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String reversedString = reverseString(str);
        System.out.println("Reversed string: " + reversedString);
        sc.close();
    }
}
