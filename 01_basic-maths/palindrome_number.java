import java.util.Scanner;

public class palindrome_number {
    public static boolean palindromeNumber(int n) {
        int original = n;
        int reverse = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n = n / 10;
        }

        return reverse == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check for palindrome: ");
        int x = sc.nextInt();
        System.out.println(palindromeNumber(x));
        sc.close();
    }
}
