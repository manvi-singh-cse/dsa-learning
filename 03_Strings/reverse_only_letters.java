public class reverse_only_letters {
    public static String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;

        while (i < j) {
            if (!Character.isLetter(arr[i])) {
                i++;
            } else if (!Character.isLetter(arr[j])) {
                j--;
            } else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        System.out.println("The original string is: " + s);
        String result = reverseOnlyLetters(s);
        System.out.println("The reversed string is: " + result);
    }
}