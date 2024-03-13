package haroon.week5_part2;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println("reverseString2(\"Hello\") = " + reverseString2("ABCD"));

        String input = "Hello, World!"; // Sample input string
        String reversed = reverseString(input); // Call the reverseString method to get the reversed string
        // Print the original and reversed strings
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }

    // A method to reverse a string in Java
    public static String reverseString2(String str) {
        // Create an empty string to store the result
        String reversed = "";
        // Loop through the characters of the original string from the end to the start
        for (int i = str.length() - 1; i >= 0; i--) {
            // Append each character to the reversed string
            reversed += str.charAt(i);
        }
        // Return the reversed string
        return reversed;
    }

    public static String reverseString(String input) {
        int length = input.length(); // Get the length of the input string
        String reversedString = ""; // Initialize an empty string to hold the reversed string
        int index = length - 1; // Set the index to the last character of the input string
        // Iterate through the characters in reverse order
        while (index >= 0) {
            reversedString += input.charAt(index); // Append the current character to the reversedString
            index--; // Move to the previous character
        }
        return reversedString; // Return the reversed string

    }

}

/*
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
 */