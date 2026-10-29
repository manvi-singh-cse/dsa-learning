public class print_num_n_to_1 {
    public static void reverse_linear_print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        reverse_linear_print(n - 1);
    }

    public static void main(String[] args) {
        int num = 6;
        reverse_linear_print(num);
    }
}
