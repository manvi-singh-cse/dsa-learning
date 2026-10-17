public class minimum_in_rotated_sorted_array {
    public static int findMin(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int answer = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[low] < arr[high]) {
                if (arr[low] < answer) {
                    answer = arr[low];
                }
                break;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] < answer) {
                    answer = arr[low];
                }
                low = mid + 1;
            } else {
                if (arr[mid] < answer) {
                    answer = arr[mid];
                }
                high = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 1, 2 };
        int result = findMin(arr);
        System.out.println("The minimum value in the rotated sorted array is: " + result);
    }
}
