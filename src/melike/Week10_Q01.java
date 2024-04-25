package melike;

import java.util.Arrays;

public class Week10_Q01 {

    public static void main(String[] args) {

        int[] arr = {3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6};
        System.out.println(Arrays.toString(shortArrayAscending(arr)));

    }

    public static int[] shortArrayAscending(int[] arr) {

        int[] shortArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }
        return arr;
    }
}
/*
Write a method that can sort the ArrayList in Ascending order without using the sort method.
 */