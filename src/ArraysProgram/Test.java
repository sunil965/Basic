package ArraysProgram;

public class Test {
   /* public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println("Before ");
        printArr(arr);
        int revBy = 2;
        reverse(arr, revBy);
        System.out.println("\nAfter ");
        printArr(arr);
    }

    private static void reverse(int[] arr, int revBy) {
        for (int i = 0; i < revBy; i++)
            revArr(arr,arr.length);
    }

    private static void revArr(int[] arr, int size) {
        int tmp = arr[0],i;
        for (i=0; i<size-1; i++){
            arr[i] = arr[i+1];
        }
            arr[i] = tmp;

    }

    private static void printArr(int[] arr) {
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }*/
   static int arr[] = new int[]{10, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    // Returns max possible value of i*arr[i]
    static int maxSum()
    {
        // Find array sum and i*arr[i] with no rotation
        int arrSum = 0;  // Stores sum of arr[i]
        int currVal = 0;  // Stores sum of i*arr[i]
        for (int i=0; i<arr.length; i++)
        {
            arrSum = arrSum + arr[i];
            currVal = currVal+(i*arr[i]);
        }

        // Initialize result as 0 rotation sum
        int maxVal = currVal;

        // Try all rotations one by one and find
        // the maximum rotation sum.
        for (int j=1; j<arr.length; j++)
        {
            currVal = currVal + arrSum-arr.length*arr[arr.length-j];
            if (currVal > maxVal)
                maxVal = currVal;
        }

        // Return result
        return maxVal;
    }

    // Driver method to test the above function
    public static void main(String[] args)
    {
        System.out.println("Max sum is " + maxSum());
    }
}
