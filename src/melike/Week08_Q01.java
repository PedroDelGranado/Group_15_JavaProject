package melike;

import java.util.Arrays;

public class Week08_Q01 {

    /*
    Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
   The function can return any such array. For example, given N = 4, the function could return [1,0, -3, 2] or [-2, 1, -4, 5]. The answer [1, -1, 1, 3]
   would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1, 0, 1] (but there are many more correct answers).
     */

    public static void main(String[] args) {

        System.out.println(Arrays.toString(generateArray(4)));

    }

    public static int[] generateArray(int n) {

        // Initialize an array of size N
        int[] arr = new int[n];

        int sum = 0;

        // Assigning values from 1 to N-1. for assigning last one negative.
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = i + 1;
            sum += arr[i];
        }

        // Assigning the last element to make the sum 0
        arr[arr.length - 1] = -sum;

        return arr;
    }


}
