public class factorial_of_n {
    public static int fact_of_n(int i, int n) {
        if (i > n) {
            return 1;
        }
        return (i * fact_of_n(i + 1, n));
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println(fact_of_n(1, num));
    }
}
