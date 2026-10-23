public class search_in_rotated_array_II {
    public static boolean searchInARotatedSortedArrayII(int[] arr, int k) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                return true;
            }
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }
            if (arr[low] <= arr[mid]) {

                if (k >= arr[low] && k < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            else {

                if (k > arr[mid] && k <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 0, 0, 1, 2 };
        int k = 3;
        boolean result = searchInARotatedSortedArrayII(arr, k);
        if (result) {
            System.out.println(k + " is present in the array.");
        } else {
            System.out.println(k + " is not present in the array.");
        }
    }
}
