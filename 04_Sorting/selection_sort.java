public class selection_sort {
    public static void selectionSort(int arr[], int n) {
		for(int i=0 ; i<n ; i++)
        {
            int min = i; 
            for(int j=i+1 ; j<n ; j++) 
            {
                if(arr[j] < arr[min])  
                {
                    min = j; 
                }
            }

            if(arr[min] < arr[i])
            {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
	}

    public static void main(String args[]) {
        int arr[] = {5, 3, 4, 2, 1};
        int n = arr.length;
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selectionSort(arr, n);
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
