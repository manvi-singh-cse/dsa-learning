import java.util.ArrayList;

public class move_zeros_to_left {
    public static void moveZerosToLeft(int[] arr, int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        for (int i = 0; i < n - temp.size(); i++) {
            arr[i] = 0;
        }

        for (int i = (n - temp.size()); i < n; i++) {
            arr[i] = temp.get(k);
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 4, 0, 5 };
        int n = arr.length;

        moveZerosToLeft(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
