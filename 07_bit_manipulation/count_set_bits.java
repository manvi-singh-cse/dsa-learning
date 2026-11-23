public class count_set_bits {
    public static String toBinary(int n) {
        String ans = "";
        while (n > 1) {
            ans = (n % 2) + ans;
            n = n / 2;
        }
        ans = 1 + ans;
        return ans;
    }

    public static int countSetBits(int n) {
        String binary = toBinary(n);
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int x = 15;
        int count = countSetBits(x);
        System.out.println("Number of set bits in " + x + " are " + count);
    }
}
