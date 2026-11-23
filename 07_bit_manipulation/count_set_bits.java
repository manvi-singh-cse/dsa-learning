public class count_set_bits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int x = 15;
        int count = countSetBits(x);
        System.out.println("Number of set bits in " + x + " are " + count);
    }
}
