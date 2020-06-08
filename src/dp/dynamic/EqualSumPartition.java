package dp.dynamic;

public class EqualSumPartition {

    public static void main(String... arg) {
        int[] array = {1, 5, 11, 5};
        System.out.println("Equal Partition Subsets of array whose sums are equal is possible : " + chekEqualSUmPartition(array));
    }

    private static boolean chekEqualSUmPartition(int[] array) {
        int sumOfArr = 0;
        for (int a : array) {
            sumOfArr += a;
        }
        if (sumOfArr % 2 != 0) {
            return false;
        } else {
            return SubsetOfSum.dynamicMethod(array, array.length, sumOfArr / 2);
        }
    }
}
