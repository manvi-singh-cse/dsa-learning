import java.util.HashMap;
import java.util.HashSet;

public class isomorphic {
    public static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int n = str1.length();
        HashMap<Character, Character> isIsomorphic = new HashMap<>();
        HashSet<Character> mapped = new HashSet<>(); // to avoid multiple mapping to same char

        for (int i = 0; i < n; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (!isIsomorphic.containsKey(c1)) {
                if (mapped.contains(c2)) {
                    return false;
                }
                isIsomorphic.put(c1, c2);
                mapped.add(c2);
            } else {
                if (isIsomorphic.get(c1) != c2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "egg";
        String str2 = "add";
        System.out.println(areIsomorphic(str1, str2)); 

        str1 = "foo";
        str2 = "bar";
        System.out.println(areIsomorphic(str1, str2)); 

        str1 = "paper";
        str2 = "title";
        System.out.println(areIsomorphic(str1, str2)); 
    }
}
