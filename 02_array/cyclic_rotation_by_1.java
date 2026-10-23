import java.util.ArrayList;

public class cyclic_rotation_by_1 {
    public static void rotate(ArrayList<Integer> arr, int n) {
        int temp = arr.get(n - 1);

        for (int i = n - 1; i > 0; i--) {
            arr.set((i), arr.get(i - 1));
        }

        arr.set((0), temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int n = arr.size();

        rotate(arr, n);
        System.out.println(arr);
    }
}
