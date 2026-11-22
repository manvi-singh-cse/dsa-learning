public class twos_complement {
    public static String onesComplement(StringBuffer binary) {
        String str = binary.toString();
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
                break;
            } else {
                arr[i] = '0';
            }
        }

        String str = new String(arr);
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                cnt = cnt + 1;
                break;
            }
        }
        if (cnt == 0) {
            str = 1 + str;
        }

        return str;
    }

    public static StringBuffer twosComplement(StringBuffer binStr) {
        String onesC = onesComplement(binStr);
        String twosC = addOne(onesC);
        return new StringBuffer(twosC);
    }

    public static void main(String args[]) {
        StringBuffer binStr = new StringBuffer("001110");
        StringBuffer twosC = twosComplement(binStr);
        System.out.println("Two's complement of " + binStr + " is " + twosC);
    }
}
