package haroon.week6_part2;

import com.sun.tools.javac.Main;

public class SumOfDigits {
    public static void main(String[] args) {
        String str = "12 java 5 apple 3";
        System.out.println(sumOfDigits(str));
    }

    public static int sumOfDigits(String input){

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isDigit(currentChar)){
                sum += Character.getNumericValue(currentChar);
            }

        }
        return sum;
    }





}
