package melike;

public class Week06_Q01 {

    public static void main(String[] args) {

        System.out.println(sumOfDigits("12 java 5 apple 3"));

    }

    public static int sumOfDigits(String input) {

        int sum = 0;

        StringBuilder numStr = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                numStr.append(ch);
            } else {
                if (numStr.length() > 0) {
                    sum += Integer.parseInt(numStr.toString());
                    numStr.setLength(0);
                }
            }
        }

        if (numStr.length() > 0) {
            sum += Integer.parseInt(numStr.toString());
        }

        return sum;
    }


}

/*
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
 */
