import java.util.*;

public class second_largest_element {
    public static int getSecondOrderElements(int n, int[] a) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }

        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }
        }

        int result = secondLargest;
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.printf("Second largest element is %d", getSecondOrderElements(n, arr));
        sc.close();
    }
}