public class power_of_two {
    public static boolean isPowerOfTwo(int n) {
        if ((n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int x = 60;
        boolean isPowerOf2 = isPowerOfTwo(x);
        if (isPowerOf2) {
            System.out.println(x + " is a power of 2");
        } else {
            System.out.println(x + " is not a power of 2");
        }
    }
}
