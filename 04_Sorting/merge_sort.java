import java.util.ArrayList;
import java.util.List;

public class merge_sort {
    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> leftPart = new ArrayList<>();
        for (int i = low; i <= mid; i++) {
            leftPart.add(arr[i]);
        }

        int leftIndex = 0;
        int rightIndex = mid + 1;
        int writeIndex = low;

        while (leftIndex < leftPart.size() && rightIndex <= high) {
            if (leftPart.get(leftIndex) <= arr[rightIndex]) {
                arr[writeIndex++] = leftPart.get(leftIndex++);
            } else {
                arr[writeIndex++] = arr[rightIndex++];
            }
        }

        while (leftIndex < leftPart.size()) {
            arr[writeIndex++] = leftPart.get(leftIndex++);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
        System.out.println("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
