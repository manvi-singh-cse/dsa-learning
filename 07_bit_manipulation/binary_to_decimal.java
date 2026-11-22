public class binary_to_decimal {
    public static int convert(int n, String str) {
        int p2 = 1;
        int ans = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                ans = ans + p2;
            }
            p2 = p2 * 2;
        }

        return ans;
    }

    public static void main(String[] args) {
        String str = "1010101";
        int n = str.length();
        int decimal = convert(n, str);
        System.out.println("Decimal of " + str + " is " + decimal);
    }
}