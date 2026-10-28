public class median_in_a_row_wise_sorted {
    public static int getSmallerEquals(int[] arr, int m, int X) {
        int low = 0;
        int high = m;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= X) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static int findMedian(int[][] matrix, int m, int n) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][n - 1]);
        }

        int required = (m * n) / 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;

            for (int i = 0; i < m; i++) {
                count += getSmallerEquals(matrix[i], n, mid);
            }

            if (count <= required) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                { 1, 3, 5 },
                { 2, 6, 9 },
                { 3, 6, 9 },
                { 5, 7, 11 }
        };

        int m = matrix.length;
        int n = matrix[0].length;

        int median = findMedian(matrix, m, n);

        System.out.println("Median = " + median);
    }
}
