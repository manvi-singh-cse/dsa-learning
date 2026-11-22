public class twos_complement {

    public static String toBinary(int n) {
        if (n == 0) {
            return "0";
        }
        String ans = "";
        while (n > 0) {
            ans = (n % 2) + ans;
            n = n / 2;
        }
        return ans;
    }

    public static String onesComplement(String str) {
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                ans += '1';
            } else {
                ans += '0';
            }
        }

        return ans;
    }

    public static String addOne(String onesC) {
        char[] arr = onesC.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '0') {
                arr[i] = '1';
                return new String(arr);
            } else {
                arr[i] = '0';
            }
        }

        return "1" + new String(arr);
    }

    public static String twosComplement(String binStr) {
        String onesC = onesComplement(binStr);
        String twosC = addOne(onesC);
        return twosC;
    }

    public static void main(String[] args) {
        int n = 0;

        String binary = toBinary(n);
        String twosC = twosComplement(binary);

        System.out.println("Binary: " + binary);
        System.out.println("One's complement: " + onesComplement(binary));
        System.out.println("Two's complement: " + twosC);
    }
}