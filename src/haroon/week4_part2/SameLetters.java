package haroon.week4_part2;

import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {

        System.out.println(same("abc", "abc"));
        System.out.println(same("abc","abb"));

    }

    public static boolean same(String str1, String str2) {
        // Convert the strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }


}

