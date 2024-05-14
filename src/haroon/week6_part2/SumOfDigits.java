package haroon.week6_part2;

import com.sun.tools.javac.Main;

public class SumOfDigits {
    public static void main(String[] args) {
        String str = "12 java 5 apple 3";
        System.out.println(sumOfDigits(str)); // Output: 20
    }

    public static int sumOfDigits(String input) {
        int sum = 0;
        StringBuilder numString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isDigit(currentChar)) {
                numString.append(currentChar);
            } else {
                if (numString.length() > 0) {
                    sum += Integer.parseInt(numString.toString());
                    numString.setLength(0);
                }
            }
        }


        if (numString.length() > 0) {
            sum += Integer.parseInt(numString.toString());
        }

        return sum;
    }





}
