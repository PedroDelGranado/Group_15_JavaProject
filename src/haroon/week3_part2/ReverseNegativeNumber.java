package haroon.week3_part2;

public class ReverseNegativeNumber {

        // Method to reverse the digits of a negative number and return it
        public static int reverseNegative(int number) {
            // Convert the negative number to a string
            String numStr = Integer.toString(number);

            // Check if the number is negative
            if (numStr.charAt(0) != '-') {
                throw new IllegalArgumentException("Input is not a negative number.");
            }

            // Remove the negative sign
            String reversedStr = numStr.substring(1);

            // Reverse the string
            StringBuilder reversedBuilder = new StringBuilder(reversedStr);
            reversedBuilder.reverse();

            // Add the negative sign back and convert back to integer
            String reversedNumStr = "-" + reversedBuilder.toString();
            int reversedNum = Integer.parseInt(reversedNumStr);

            return reversedNum;
        }

        public static void main(String[] args) {
            int num = -12345; // Example negative number
            int reversedNum = reverseNegative(num);
            System.out.println("Original number: " + num);
            System.out.println("Reversed number: " + reversedNum);
        }
}
