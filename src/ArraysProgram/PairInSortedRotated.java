package ArraysProgram;

public class PairInSortedRotated {
    public static void main (String[] args)
    {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int sum = 16;
        int n = arr.length;

        if (pairInSortedRotated(arr, n, sum))
            System.out.print("Array has two elements with sum 16");
        else
            System.out.print("Array doesn't have two elements with sum 16 ");
    }

    private static boolean pairInSortedRotated(int[] arr, int n, int sum) {
        boolean exist = false;
        int pivot = findPivot(arr,n);
        if(pivot>=0)
            exist = true;
        return exist;
    }

    private static int findPivot(int[] arr, int n) {
        /*for (int i=0; i<n; i++)
            if (arr[i]>arr[i+1])
                return i;
        return -1;*/
        int l = 0, h = n-1;
        return findPivotByBinary(arr,l,h);
    }

    private static int findPivotByBinary(int[] arr, int l, int h) {
        if (l > h) return -1;
        if (l == h) return l;

        int mid = (l + h) / 2;            //        11, 15, 6, 8, 9, 10
        if (mid < h && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > l && arr[mid] > arr[mid - 1])
            return mid - 1;
        if (arr[l] >= arr[mid])
            return findPivotByBinary(arr, l, mid + 1);
        return findPivotByBinary(arr, mid - 1, h);
    }
}
