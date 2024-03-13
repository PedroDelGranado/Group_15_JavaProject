package haroon.week4_part2;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBCDD";
        String result = ""; // a2b1c3d1
                           //  a b c d
                          //   2 1 3 1

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch){
                    count++;
                }
            }
            if (result.contains("" + ch)){ // if the character is already in the result you shouldn't add
                continue; // and skip that character // this condition is avoiding the duplicate
            }
            result += ch + "" + count;
        }

        System.out.println(result);


    }

}
/*
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */