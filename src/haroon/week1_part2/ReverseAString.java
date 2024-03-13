package haroon.week1_part2;

public class ReverseAString {

    public static void main(String[] args) {


        String str = "Life is good";
        String result1 = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            result1 += str.charAt(i);

        }
        System.out.println(result1);  //doog si efiL

        System.out.println("------------------------------------");

        // reverse the sentence without reversing the words



        String str2= "Life is good";
        String reversedSentence = "";

        String[] arr = str2.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedSentence += arr[i] + " ";
        }
        System.out.println(reversedSentence.trim());  //good is Life

        System.out.println("------------------------------------");

        //How to reverse each word in a string;

        String str3 = "Life is good";
        String result3 = "";

        String[] words = str3.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";

            for(int j = word.length()-1; j >=0; j--){
                reverseWord += word.charAt(j);
            }
            result3 += reverseWord + " ";
        }

        System.out.println(result3);

    }


}
