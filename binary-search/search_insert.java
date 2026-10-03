public class search_insert {
    public static int searchInsert(int[] arr, int m) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == m) {
                return mid;
            } else if (arr[mid] < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 8 };
        int m = 6;
        int result = searchInsert(arr, m);
        System.out.println("The index of the target value is: " + result);
    }
}
