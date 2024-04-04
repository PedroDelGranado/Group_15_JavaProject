package melike;

import java.util.Arrays;

public class Week08_Q02 {

    /*
    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input: {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static void main(String[] args) {

        int[] arr = {1,0,2,0,3,0,4,0};

        System.out.println(Arrays.toString(moveAllZerosToEnd(arr)));


    }

    public static int[] moveAllZerosToEnd(int[] arr){

        // Create a new array with the same length as the input array
        int[] arr2 = new int[arr.length];

        // Initialize an index variable to track the position in the new array
        int index = 0;

        // Iterate through each element of the input array
        for(int i = 0; i < arr.length; i++){
            // If not zero, copy the element to the new array and increment the index
            if(arr[i]!= 0){
                arr2[index++] = arr[i];
            }
        }

        return arr2;
    }

}


