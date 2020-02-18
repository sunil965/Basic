package ArraysProgram;

public class KeyInReveraeRotated {
    public static void main(String args[]) {
        int arr[] = {3, 4, 5, 6,1, 2};
        int n = arr.length;
        int key = 5;
        System.out.println("Index of the element is : " + pivotedBinarySearch(arr, n, key));
    }

    private static int pivotedBinarySearch(int[] arr, int n, int key) {
        int low = 0, high = n - 1;
        int pivot = findPivot(arr, low, high);
        if (pivot == -1)
            return binarySearch(arr, low, high, key);
        if (arr[pivot] == key)
            return pivot;
        if (arr[0] > key)
            return binarySearch(arr, pivot + 1, high, key);
        return binarySearch(arr, low, pivot - 1, key);
    }

    private static int findPivot(int[] arr, int low, int high) {
        if (high < low) return -1;
        if (high == low) return low;
        int mid = (low + high) / 2;

        if (mid < high && arr[mid] > arr[mid + 1]) return mid; // Mid Should be smaller than high.
        if (mid > low && arr[mid] < arr[mid - 1]) return mid - 1; // Mid Should be grater than low.
        if (arr[low] >= arr[mid])
            return findPivot(arr, low, mid - 1);
        return findPivot(arr, mid + 1, high);

    }

    static int binarySearch(int arr[], int low, int high, int key) {
        if (high < low)
            return -1;
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }
}
