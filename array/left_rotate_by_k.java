import java.util.ArrayList;

public class left_rotate_by_k {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> temp = new ArrayList<>();
        int n = arr.size();

        for (int i = 0; i < k; i++) {
            temp.add(arr.get(i));
        }

        for (int i = k; i < n; i++) {
            arr.set((i - k), arr.get(i));
        }

        int j = 0;
        for (int i = (n - k); i < n; i++) {
            arr.set(i, temp.get(j));
            j++;
        }

        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int k = 2;

        ArrayList<Integer> rotatedArray = rotateArray(arr, k);
        System.out.println(rotatedArray);
    }
}