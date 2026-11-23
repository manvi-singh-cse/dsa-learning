public class swap_two_numbers {
    public static int[] swapNumber(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        int[] ans = { x, y };
        return ans;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("Before swapping : x = " + x + " y = " + y);
        int[] swapped = swapNumber(x, y);
        System.out.println("After swapping : x = " + swapped[0] + " y = " + swapped[1]);
    }
}
