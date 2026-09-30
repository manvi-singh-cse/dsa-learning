public class insertion_sort {
    public static void insertionSort(int n, int[] arr) {
        for (int index = 1; index < n; index++) {
            int key = arr[index];
            int position = index - 1;

            while (position >= 0 && arr[position] > key) {
                arr[position + 1] = arr[position];
                position--;
            }

            arr[position + 1] = key;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 3, 4, 2, 1 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertionSort(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
