package list;

/**
 * The idea is to keep k pointers which will constitute the elements in the range, by taking the min and max
 * of the K elements the range can be formed. Initially, all the pointers will point to the start of all the
 * K arrays. Store the range max to min. If the range has to be minimized then either the minimum value has
 * to be increased or the maximum value has to be decreased. To decrease the maximum value we have to move
 * our pointer of current maximum to the left and since we are currently at 0 the index of every list, so we
 * can’t move our pointer to left, hence we can’t decrease the current max. So, the only possible option to
 * get a better range is to increase the current minimum. To continue increasing the minimum value, increase
 * the pointer of the list containing the minimum value and update the range until one of the lists exhausts.
 */
public class SmallestRangInKLists {

    // array for storing the current index of list i
    static int[] ptr = new int[501];
    static final int N = 5;

    public static void main(String[] args) {
        int[][] arr = {
                {4, 7, 9, 12, 15},
                {0, 8, 10, 14, 20},
                {6, 12, 16, 30, 50}
        };

        int k = arr.length;

        System.out.println("List count : " + k);
        System.out.println("List's element count : 5");

        System.out.println("Naive Approach");
        findSmallestRangeNaiveApproach(arr, k);

        System.out.println("Min Heap Approach");
        findSmallestRangeMinHeapApproach(arr, k);
    }

    /**
     * Follow the given steps to solve the problem:
     * <p>
     * Create an extra space ptr of length K to store the pointers and a variable minrange initialized to a maximum value.
     * Initially, the index of every list is 0, therefore initialize every element of ptr[0..k] to 0, and the array ptr will store the index of the elements in the range.
     * Repeat the following steps until at least one list exhausts:
     * Now find the minimum and maximum value among the current elements of all the lists pointed by the ptr[0…k] array.
     * Update the minrange if the current (max-min) is less than minrange.
     * increment the pointer pointing to the current minimum element.
     */
    private static void findSmallestRangeNaiveApproach(int[][] arr, int k) {
        int minEl = 0, maxEl = 0, minRange, minValue, maxValue, flag, minIndex;

        for (int i = 0; i <= k; i++) {
            ptr[i] = 0;
        }
        minRange = Integer.MAX_VALUE;

        while (true) {
            minIndex = -1;
            minValue = Integer.MAX_VALUE;
            maxValue = Integer.MIN_VALUE;
            flag = 0;

            for (int i = 0; i < k; i++) {
                // if every element of list[i] is traversed then break the loop
                if (ptr[i] == N) {
                    flag = 1;
                    break;
                }
                // Find Min values among all list elements pointing by the ptr[] array
                if (ptr[i] < N && arr[i][ptr[i]] < minValue) {
                    minIndex = i;
                    minValue = arr[i][ptr[i]];
                }

                // Find Max values among all list elements pointing by the ptr[] array
                if (ptr[i] < N && arr[i][ptr[i]] > maxValue) {
                    maxValue = arr[i][ptr[i]];
                }
            }
            if (flag == 1)
                break;
            ptr[minIndex]++;

            // updating the minrange
            if ((maxValue - minValue) < minRange) {
                minEl = minValue;
                maxEl = maxValue;
                minRange = maxEl - minEl;
            }
        }
        System.out.printf("The smallest range is [%d, %d]\n", minEl, maxEl);
    }

    // A min heap node
    static class Node {
        // The element to be stored
        int ele;

        // index of the list from which the element is taken
        int i;

        // index of the next element to be picked from list
        int j;

        Node(int a, int b, int c) {
            this.ele = a;
            this.i = b;
            this.j = c;
        }
    }

    // A class for Min Heap
    static class MinHeap {
        Node[] harr; // array of elements in heap
        int size; // size of min heap

        // Constructor: creates a min heap of given size
        MinHeap(Node[] arr, int size) {
            this.harr = arr;
            this.size = size;
            int i = (size - 1) / 2;
            while (i >= 0) {
                MinHeapify(i);
                i--;
            }
        }

        // to get index of left child of node at index i
        int left(int i) {
            return 2 * i + 1;
        }

        // to get index of right child of node at index i
        int right(int i) {
            return 2 * i + 2;
        }

        // to heapify a subtree with root at given index
        void MinHeapify(int i) {
            int l = left(i);
            int r = right(i);
            int small = i;

            if (l < size && harr[l].ele < harr[i].ele)
                small = l;

            if (r < size && harr[r].ele < harr[small].ele)
                small = r;

            if (small != i) {
                swap(small, i);
                MinHeapify(small);
            }
        }

        void swap(int i, int j) {
            Node temp = harr[i];
            harr[i] = harr[j];
            harr[j] = temp;
        }

        // to get the root
        Node getMin() {
            return harr[0];
        }

        // to replace root with new node x and heapify() new root
        void replaceMin(Node x) {
            harr[0] = x;
            MinHeapify(0);
        }
    }

    /**
     * Follow the given steps to solve the problem:
     * <p>
     * create a Min-Heap to store K elements, one from each array, and a variable minrange initialized to a maximum value and also keep a variable max to store the maximum integer.
     * Initially put the first element from each list and store the maximum value in max.
     * Repeat the following steps until at least one list exhausts :
     * To find the minimum value or min, use the top or root of the Min heap which is the minimum element.
     * Now update the minrange if the current (max-min) is less than minrange.
     * remove the top or root element from the priority queue, insert the next element from the list containing the min element, and update the max with the new element inserted.
     * <p>
     * - This function takes a k sorted lists in the form of 2D array as an argument.
     * - It finds out smallest range that includes elements from each of the k lists.
     */
    private static void findSmallestRangeMinHeapApproach(int[][] arr, int K) {
        int range = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int start = -1, end = -1;

        int N = arr[0].length;

        // Create a min heap with K heap nodes. Every heap node has first element of an list
        Node[] arr1 = new Node[K];
        for (int i = 0; i < K; i++) {
            Node node = new Node(arr[i][0], i, 1);
            arr1[i] = node;

            // store max element
            max = Math.max(max, node.ele);
        }

        // Create the heap
        MinHeap mh = new MinHeap(arr1, K);

        // Now one by one get the minimum element
        // from min heap and replace it with
        // next element of its list
        while (true) {
            // Get the minimum element and store it in output
            Node root = mh.getMin();

            // update min
            min = root.ele;

            // update range
            if (range > max - min + 1) {
                range = max - min + 1;
                start = min;
                end = max;
            }

            // Find the next element that will replace current root of heap.
            // The next element belongs to same list as the current root.
            if (root.j < N) {
                root.ele = arr[root.i][root.j];
                root.j++;

                // update max element
                if (root.ele > max)
                    max = root.ele;
            }
            // break if we have reached end of any list
            else
                break;

            // Replace root with next element of list
            mh.replaceMin(root);
        }
        System.out.print("The smallest range is [" + start + ", " + end + "]");
    }
}
