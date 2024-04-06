package vera;

import java.util.Arrays;

public class Week08_Q01 {
    public static void main(String[] args) {
        int[] a = {10,5,6};
        int[] b = {1,55,7};
        int[]c = concatArrays(a,b);
        System.out.println(Arrays.toString(c));


    }

    public static int[] concatArrays(int[] arr1, int[] arr2){

        //int totalLength = arr1.length + arr2.length;
        int[] result = new int[arr1.length + arr2.length];

        System.arraycopy(arr1,0,result,0,arr1.length);
        System.arraycopy(arr2,0,result,arr1.length,arr2.length);


        return result;
    }


}
/*
Write a return method that can concatenate two arrays
*/