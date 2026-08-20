import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class duplicate_element {
    public static int findDuplicate(ArrayList<Integer> arr, int n) {
        Set<Integer> visited = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            if (!visited.add(arr.get(i))) {
                return arr.get(i);
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(3);

        int n = arr.size();
        int duplicate = findDuplicate(arr, n);

        if (duplicate != -1) {
            System.out.printf("Duplicate element is %d", duplicate);
        } else {
            System.out.println("No duplicate element found.");
        }
    }
}
