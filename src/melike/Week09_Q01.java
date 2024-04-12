package melike;

import java.util.Arrays;

public class Week09_Q01 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};

        int[] result = concat2Array(arr1,arr2);

        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));

    }

    public static int[] concat2Array(int[] arr1, int[] arr2){

        int[] result = new int[arr1.length + arr2.length];

        int index = 0;

        for (int value : arr1) {

            result[index++] = value;

        }

        for(int value : arr2){
            result[index++] = value;
        }

        return result;

    }

}
/*
Write a return method that can concatenate two arrays
 */