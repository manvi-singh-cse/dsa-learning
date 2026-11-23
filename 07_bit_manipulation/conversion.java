public class conversion {
    public static int toDecimal(int n, String str) {
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

    public static String toBinary(int n) {
        String ans = "";
        while (n > 1) {
            ans = (n % 2) + ans;
            n = n / 2;
        }
        ans = 1 + ans;
        return ans;
    }

    public static void main(String[] args) {
        String str = "1010101";
        int len = str.length();
        int decimal = toDecimal(len, str);
        System.out.println("Decimal of " + str + " is " + decimal);

        int n = 15;
        int binary = Integer.parseInt(toBinary(n));
        System.out.println("Binary of " + n + " is " + binary);
    }
}