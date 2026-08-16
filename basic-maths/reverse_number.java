import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int N = sc.nextInt();
        int reverse = 0;

        while (N > 0) {
            int lastDigit = N % 10;
            reverse = (reverse * 10) + lastDigit;
            N = N / 10;
        }

        System.out.println(reverse);
        sc.close();
    }
}
