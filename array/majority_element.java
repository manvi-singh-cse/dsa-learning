import java.util.*;

public class majority_element {
    public static int findMajority(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        return (-1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int majorityElement = findMajority(arr, n);
        if (majorityElement != -1) {
            System.out.printf("Majority element is %d", majorityElement);
        } else {
            System.out.println("No majority element found");
        }
        sc.close();
    }
}