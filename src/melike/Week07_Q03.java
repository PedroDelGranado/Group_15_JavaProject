package melike;

import java.util.Arrays;

public class Week07_Q03 {

    /*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */

    public static void main(String[] args) {

        int[] arr = {10, 20, 7, 8, 90};

        System.out.println(Arrays.toString(sortArrayDesc(arr)));

    }

    public static int[] sortArrayDesc(int[] arr) {

        //compares each element in the array with all the elements that come after it.
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //If it finds a bigger element, it swaps their positions.
                if (arr[i] < arr[j]) {
                    int num = arr[i];
                    arr[i] = arr[j];
                    arr[j] = num;
                }
            }//Then, it moves to the next element and repeats the process.
        }
        return arr;

    }

}
