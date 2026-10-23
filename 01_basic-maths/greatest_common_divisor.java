import java.util.Scanner;

public class greatest_common_divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers to find their GCD: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        while (n > 0 && m > 0) {
            if (n > m) {
                n = n % m;
            } else {
                m = m % n;
            }
        }

        if (m == 0) {
            System.out.println(n);
        } else {
            System.out.println(m);
        }
        sc.close();
    }
}
