public class floor_and_ceil {
    public static int[] getFloorAndCeil(int[] arr, int n, int X) {
        int high = n - 1;
        int low = 0;
        int floor = -1;
        int ceil = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == X) {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            } else if (arr[mid] > X) {
                ceil = arr[mid];
                high = mid - 1;
            } else {
                floor = arr[mid];
                low = mid + 1;
            }
        }

        return new int[] { floor, ceil };
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 10, 10, 12, 19 };
        int X = 11;
        int n = arr.length;

        int[] result = getFloorAndCeil(arr, n, X);
        System.out.println("Floor: " + result[0]);
        System.out.println("Ceil: " + result[1]);
    }
}
