public class number_of_occurrence {
    public static int count(int arr[], int n, int x) {
        int count = 0;
        int fIdx = firstCount(arr, n, x);
        int lIdx = lastCount(arr, n, x);
        if (fIdx == -1)
        {
            return 0;
        }
        count = lIdx - fIdx + 1;
        return count;
    }    
    
    public static int firstCount(int arr[], int n, int x) {
        int firstIdx = -1;
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == x)
            { 
                firstIdx = mid;                
                high = mid-1;
            }
            else if(arr[mid] < x)
            {                
                low = mid+1;
            }
            else 
            {
                high = mid-1;
            }
        }
        return firstIdx;
    }

    public static int lastCount(int arr[], int n, int x) {
        int lastIdx = -1;
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == x)
            { 
                lastIdx = mid;                
                low = mid+1;
            }
            else if(arr[mid] < x)
            {                
                low = mid+1;
            }
            else 
            {
                high = mid-1;
            }
        }
        return lastIdx;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 3, 4, 5};
        int n = arr.length;
        int x = 2;
        int result = count(arr, n, x);
        if (result == 0) {
            System.out.println(x + " is not present in the array.");
        } else {
        System.out.println("The number of occurrences of " + x + " is: " + result);
        }
    }
}
