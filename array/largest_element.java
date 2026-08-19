import java.util.*;

public class largest_element {

    static int largestElement(int[] arr, int n) {
        int greatest = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];
            }
        }
        return greatest;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.printf("Largest element is %d", largestElement(arr, n));
        sc.close();
    }
}