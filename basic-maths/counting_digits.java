public class counting_digits {
    public static void main(String[] args) {
        long x = 1234567890;
        System.out.println(countDigit(x));
    }

    public static int countDigit(long x) {
        int count = 0;
        while (x > 0) {
            long lastdigit = x % 10;
            count++;
            x = x / 10;
        }
        return count;
    }
}