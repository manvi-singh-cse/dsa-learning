public class print_num_1_to_n {
    public static void linear_print(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        linear_print(i + 1, n);
    }

    public static void main(String[] args) {
        int num = 6;
        linear_print(1, num);
    }
}