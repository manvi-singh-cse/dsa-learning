import java.util.*;

public class occurence_of_each_word {
    public static void occurrenceOfEachWord(String s) {
        if (s != "") {
            s = s.trim();
            Map<String, Integer> word = new HashMap<>();
            String[] words = s.toLowerCase().split("\\s+");
            for (String single_word : words) {
                word.put(single_word, word.getOrDefault(single_word, 0) + 1);
            }
            for (Map.Entry<String, Integer> entry : word.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        occurrenceOfEachWord(s);
        sc.close();
    }
}