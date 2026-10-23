public class basic_binary_search {
    public static int binarySearch(int[] arr, int high, int low, int target) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, mid - 1, low, target);
        } else {
            return binarySearch(arr, high, mid + 1, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40 };
        int target = 10;
        int result = binarySearch(arr, arr.length - 1, 0, target);
        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
