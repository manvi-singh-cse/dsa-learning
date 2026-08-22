import java.util.ArrayList;
import java.util.List;

public class union_sorted_array {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        List<Integer> Union = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != a[i]) {
                    Union.add(a[i]);
                }
                i++;
            }

            else if (a[i] > b[j]) {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != b[j]) {
                    Union.add(b[j]);
                }
                j++;
            }

            else {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != b[j]) {
                    Union.add(b[j]);
                }
                i++;
                j++;
            }
        }

        while (i < n) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != a[i]) {
                Union.add(a[i]);
            }
            i++;
        }

        while (j < m) {

            if (Union.isEmpty() || Union.get(Union.size() - 1) != b[j]) {
                Union.add(b[j]);
            }
            j++;

        }

        return Union;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 3 };

        List<Integer> Union = sortedArray(a, b);
        System.out.println(Union);
    }
}
