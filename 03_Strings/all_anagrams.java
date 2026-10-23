import java.util.*;

public class all_anagrams {
    public static ArrayList<Integer> findAnagramsIndices(String str, int n, String ptr, int m) {
        ArrayList<Integer> indexes = new ArrayList<>();
        if (m > n)
            return indexes;

        Map<Character, Integer> patFreq = new HashMap<>();
        Map<Character, Integer> winFreq = new HashMap<>();

        for (int i = 0; i < m; i++) {
            patFreq.put(ptr.charAt(i), patFreq.getOrDefault(ptr.charAt(i), 0) + 1);
            winFreq.put(str.charAt(i), winFreq.getOrDefault(str.charAt(i), 0) + 1);
        }

        if (patFreq.equals(winFreq)) {
            indexes.add(0);
        }

        for (int i = m; i < n; i++) {
            char addChar = str.charAt(i);
            char removeChar = str.charAt(i - m);

            winFreq.put(addChar, winFreq.getOrDefault(addChar, 0) + 1);
            winFreq.put(removeChar, winFreq.get(removeChar) - 1);
            if (winFreq.get(removeChar) == 0) {
                winFreq.remove(removeChar);
            }

            if (patFreq.equals(winFreq)) {
                indexes.add(i - m + 1);
            }
        }

        return indexes;
    }

    public static void main(String[] args) {
        String str = "cbaebabacd";
        String ptr = "abc";
        int n = str.length();
        int m = ptr.length();

        ArrayList<Integer> result = findAnagramsIndices(str, n, ptr, m);
        System.out.println(result);
    }
}