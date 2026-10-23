import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class all_divisors {
    public static List<Integer> printDivisors(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
                if (i != n / i) {
                    factors.add(n / i);
                }
            }
        }
        factors.sort(null);
        return factors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get it's factors: ");
        int n = sc.nextInt();
        List<Integer> divisors = printDivisors(n);
        System.out.println("Divisors of " + n + ": " + divisors);
        sc.close();
    }
}