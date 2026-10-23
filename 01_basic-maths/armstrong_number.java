import java.util.*;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check for armstrong: ");
        int num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int lastDigit = num % 10;
            sum += Math.pow(lastDigit, digits);
            num /= 10;
        }

        return sum == original;
    }
}