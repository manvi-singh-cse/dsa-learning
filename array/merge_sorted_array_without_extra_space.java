public class merge_sorted_array_without_extra_space {
    public class Solution {
        public static void mergeTwoSortedArraysWithoutExtraSpace(long[] a, long[] b) {
            int idx_a = 0;
            int idx_b = 0;
            int n = a.length;
            int m = b.length;

            while (idx_a < n && idx_b < m) {

                if (a[idx_a] <= b[idx_b]) {
                    idx_a++;
                } else {
                    long temp = a[idx_a];
                    a[idx_a] = b[idx_b];
                    b[idx_b] = temp;

                    while (idx_b + 1 < m && b[idx_b] > b[idx_b + 1]) {
                        temp = b[idx_b];
                        b[idx_b] = b[idx_b + 1];
                        b[idx_b + 1] = temp;
                        idx_b++;
                    }

                    idx_a++;
                    idx_b = 0;
                }
            }
        }

        public static void main(String[] args) {
            long[] a = { 1, 1, 3, 6, 9, 9 };
            long[] b = { 1, 2, 3, 4, 8, 8 };

            System.out.println("Array A before merging: ");
            for (long num : a) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.println("Array B before merging: ");
            for (long num : b) {
                System.out.print(num + " ");
            }
            System.out.println();

            mergeTwoSortedArraysWithoutExtraSpace(a, b);

            System.out.println("Array A after merging: ");
            for (long num : a) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.println("Array B after merging: ");
            for (long num : b) {
                System.out.print(num + " ");
            }
        }
    }
}