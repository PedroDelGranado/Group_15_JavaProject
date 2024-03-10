package melike;

import java.util.Arrays;

public class Week04_Q02 {

    public static void main(String[] args) {

        System.out.println(lettersSame("abc", "cab"));
        System.out.println(lettersSame("abc", "abb"));

    }

    public static  boolean lettersSame(String str1, String str2){

        if(str1.length() != str2.length() ){
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);



    }


}
/*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */