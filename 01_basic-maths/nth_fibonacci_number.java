import java.util.Scanner;

public class nth_fibonacci_number {
    public static int fibonacciNumber(int n) {
        long mod = 1000000007;
        long ans = 0;
        if (n == 1) {
            ans = 1;
        }
        if (n > 1) {
            long i = 0;
            long j = 1;
            for (int k = 1; k < n; k++) {
                ans = (i + j) % mod;
                i = j;
                j = ans;
            }
        }
        return (int) (ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n to find the nth fibonacci number ");
        int n = sc.nextInt();
        System.out.println(n + "th fibonacci number is " + fibonacciNumber(n));
        sc.close();
    }
}