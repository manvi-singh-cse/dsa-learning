import java.util.Scanner;

public class prime_number {
    public static String isPrime(int num) {
        if (num <= 1) {
            return "NO";
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        sc.close();
    }
}
