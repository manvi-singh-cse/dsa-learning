import java.util.* ;
import java.util.ArrayList;

public class max_product_subarray {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		int prefix = 1;
		int suffix = 1;
		int product = Integer.MIN_VALUE;

		for(int i=0 ; i<n ; i++)
		{
			if(prefix == 0)
			{
				prefix = 1;
			}
			if(suffix == 0)
			{
				suffix = 1;
			}

			prefix = prefix * arr.get(i);
			suffix = suffix * arr.get(n-i-1);
			product = Math.max(product, Math.max(prefix, suffix));
		}
		return product;
	}

    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 3, -2, 4, -1, 0, -3, 1));
        int n = arr.size();
        int result = maximumProduct(arr, n);
        System.out.println("Maximum product subarray: " + result);
    }
}