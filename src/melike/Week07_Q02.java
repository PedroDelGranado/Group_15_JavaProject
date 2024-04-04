package melike;

import java.util.Arrays;

public class Week07_Q02 {

    /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};

        System.out.println(Arrays.toString(sortArrayAsc(arr)));

    }

    public static int[] sortArrayAsc(int[] arr){


        //compares each element in the array with all the elements that come after it.
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //If it finds a smaller element, it swaps their positions.
                if (arr[i] > arr[j]) {
                    int num = arr[i];
                    arr[i] = arr[j];
                    arr[j] = num;
                }
            }//Then, it moves to the next element and repeats the process.
        }
        return arr;

    }



}
