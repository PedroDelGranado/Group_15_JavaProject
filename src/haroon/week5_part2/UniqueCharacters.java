package haroon.week5_part2;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        String result = "";


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); //'A'
            int count = 0; // represents the frequency of the ch

            for (int i = 0; i < str.length(); i++) { //compares the character that outer loop picked, with each character of the string,
                char each = str.charAt(i); // each character of str
                if (ch == each) {
                    count++;
                }
            }

            if (count != 1){
                continue;
            }

            result += ch;
        }
        System.out.println(result);
    }
}
/*
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */