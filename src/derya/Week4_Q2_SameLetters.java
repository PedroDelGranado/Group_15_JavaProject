package derya;

import java.util.Arrays;

public class Week4_Q2_SameLetters {
    public static void main(String[] args) {

        System.out.println(same("abc", "cab"));
        System.out.println(same("abc", "abb"));
    }

    public static boolean same(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }


        char[] arr1 = str1.toCharArray(); //a b c
        char[] arr2 = str2.toCharArray();  // c a b

        Arrays.sort(arr1); //a b c
        Arrays.sort(arr2);  // a b c

        return  Arrays.equals(arr1,arr2); // return boolean
    }
}
/*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */