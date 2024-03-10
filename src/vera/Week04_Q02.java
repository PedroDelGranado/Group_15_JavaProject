package vera;

import java.util.Arrays;

public class Week04_Q02 {

    public static void main(String[] args) {

        System.out.println(returnMethod("abc","cab"));
        System.out.println(returnMethod("abc","abb"));


    }

    public static boolean returnMethod(String str1, String str2) {


         char[] strA = str1.toCharArray();
         char[] strB = str2.toCharArray();
         Arrays.sort(strA);
         Arrays.sort(strB);
         return Arrays.equals(strA,strB);


    }

}
/*Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false*/