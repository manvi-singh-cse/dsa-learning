public class toggle_k_bits {
    public static int toggleKBits(int n, int k) {
        int mask = (1 << k) - 1;
        return n ^ mask;
    }

    public static void main(String[] args) {
        int x = 40;
        int k = 4;

        System.out.println("Before toggling : x = " + x);
        int toggled = toggleKBits(x, k);
        System.out.println("After toggling : x = " + toggled);
    }
}
