package haroon.week4_part2;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AAABBBCCC";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (result.contains( "" + str.charAt(i) )){ // if the character is already contained in new string then we skip it
                continue; // skip it
            }

            result += str.charAt(i);

        }

        System.out.println(result);


    }
}

/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */