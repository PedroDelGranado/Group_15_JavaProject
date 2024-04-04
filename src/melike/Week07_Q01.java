package melike;

public class Week07_Q01 {

    /*
    Write a method that can find the minimum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */
    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};

        System.out.println("minNumber = " + minNumber(arr));


    }

    public static int minNumber(int[] arr){

        //It initializes a variable minNumber with the first element of the array (arr[0]).
       int minNumber = arr[0];

       //It then iterates over the array starting from index 1
        for(int i = 1; i < arr.length; i++){

            //it compares each element of the array with the current minNumber.
            if(arr[i] < minNumber){
                minNumber = arr[i];
            }

        }

        return minNumber;
    }


}
