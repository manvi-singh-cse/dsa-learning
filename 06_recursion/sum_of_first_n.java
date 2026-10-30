public class sum_of_first_n {
    public static int sum_of_n(int i, int n) {
        if (i > n) {
            return 0;
        }
        return (i + sum_of_n(i + 1, n));
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println(sum_of_n(1, num));
    }
}
