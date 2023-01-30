package ArraysProgram;

import java.util.HashMap;
import java.util.Map;

/*
    Program to find the distinct numbers in the given window.
*/
public class DistinctNumberInWindowOfK {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 1, 3, 1, 1, 3};
        int window = 4;
        solution(array, window);
    }

    private static void solution(int[] arr, int window) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < window; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map.size());

        for (int i = window; i < arr.length; i++) {
            if (map.get(arr[i - window]) == 1)
                map.remove(arr[i - window]);
            else
                map.put(arr[i - window], map.get(arr[i - window]) - 1);

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            System.out.println(map.size());
        }
    }
}
