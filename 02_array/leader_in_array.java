import java.util.*;

public class leader_in_array {
    public static ArrayList<Integer> findLeaders(ArrayList<Integer> elements, int n) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean found = true;
            for (int j = i + 1; j < n; j++) {
                if (elements.get(j) > elements.get(i)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                result.add(elements.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        ArrayList<Integer> elements = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            elements.add(sc.nextInt());
        }
        ArrayList<Integer> leaders = findLeaders(elements, n);
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
        sc.close();
    }
}