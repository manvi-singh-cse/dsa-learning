import java.util.ArrayList;
import java.util.List;

public class kth_permutation {
    public static String kthPermutation(int n, int k) {
        String ans = "";
        List<Integer> res = new ArrayList<>();
        int fact = 1;

        for (int i = 1; i < n; i++) {
            fact = fact * i;
            res.add(i);
        }

        res.add(n);
        k = k - 1;

        while (true) {
            ans = ans + res.get(k / fact);
            res.remove(k / fact);
            if (res.size() == 0) {
                break;
            }

            k = k % fact;
            fact = fact / res.size();
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        int k = 4;
        String result = kthPermutation(n, k);
        System.out.println("The " + k + "-th permutation of numbers from 1 to " + n + " is: " + result);
    }
}
