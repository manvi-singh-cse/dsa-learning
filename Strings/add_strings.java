import java.util.*;

public class add_strings {

    public static String stringConcatenation(String num1, String num2) {
        int int1 = 0;
        int int2 = 0;
        int sum = 0;
        for (int i = 0; i < num1.length(); i++) {
            int1 = int1 * 10 + (num1.charAt(i) - '0');
        }
        for (int i = 0; i < num2.length(); i++) {
            int2 = int2 * 10 + (num2.charAt(i) - '0');
        }
        sum = int1 + int2;
        return String.valueOf(sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        System.out.println(stringConcatenation(num1, num2));
        sc.close();
    }
}
