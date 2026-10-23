import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quick_sort {
    public static int partitionIndex(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while (arr.get(i) <= pivot && i <= (high - 1)) {
                i++;
            }
            while (arr.get(j) > pivot && j >= (low + 1)) {
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);

        return j;
    }

    public static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            int partition = partitionIndex(arr, low, high);
            qs(arr, low, (partition - 1));
            qs(arr, (partition + 1), high);
        }
    }

    public static List<Integer> quickSort(List<Integer> arr) {
        qs(arr, 0, (arr.size() - 1));
        return arr;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(38, 27, 43, 3, 9, 82, 10));

        System.out.println("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        List<Integer> sortedArr = quickSort(arr);

        System.out.println("Sorted array: ");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}
