import java.util.*;

public class majority_element_2 {
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int size = arr.size();
        for (int i = 0; i < size; i++) {
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
            if (count > (size / 3) && !result.contains(arr.get(i))) {
                result.add(arr.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 2, 3, 1, 2, 2, 3, 3));
        ArrayList<Integer> result = majorityElementII(arr);
        System.out.println(result);
    }
}