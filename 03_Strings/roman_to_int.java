import java.util.*;

public class roman_to_int {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> RtoI = new HashMap<>();
        RtoI.put('I', 1);
        RtoI.put('V', 5);
        RtoI.put('X', 10);
        RtoI.put('L', 50);
        RtoI.put('C', 100);
        RtoI.put('D', 500);
        RtoI.put('M', 1000);

        int result = RtoI.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (RtoI.get(s.charAt(i)) < RtoI.get(s.charAt(i + 1))) {
                result -= RtoI.get(s.charAt(i));
            } else {
                result += RtoI.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("XII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
