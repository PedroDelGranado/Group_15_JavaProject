package melike;

public class Week06_Q03 {

    public static void main(String[] args) {

        int [] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(maxNumber(arr));

    }

    public static int maxNumber(int[] arr) {

        int max = arr[0];
        for (int each : arr) {

            if (each > max) {
                max = each;
            }
        }
        return max;

    }
}
/*
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */