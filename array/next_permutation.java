import java.util.*;

public class next_permutation {
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) {
        int n = permutation.size();
        int index = -1;
        for (int i = n - 2; i > 0; i--) {
            if (permutation.get(i) < permutation.get(i + 1)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            Collections.reverse(permutation);
            return permutation;
        }
        for (int i = n - 1; i > index; i--) {
            if (permutation.get(index) < permutation.get(i)) {
                Collections.swap(permutation, i, index);
                break;
            }
        }
        Collections.reverse(permutation.subList(index + 1, n - 1));
        return permutation;
    }

    public static void main(String[] args) {
        ArrayList<Integer> permutation = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> nextPerm = nextPermutation(permutation);
        System.out.println(nextPerm);
    }
}