package melike;

public class Week05_Q01 {

    public static void main(String[] args) {

        System.out.println(uniqueCharacters("AAABBBCCCDEF"));
    }

    public static String uniqueCharacters(String str) {

        String[] str2 = str.split("");

        String unique = "";

        for (int i = 0; i < str2.length; i++) {

            int num = 0;

            for (int j = 0; j < str2.length; j++) {
                if (str2[j].equals(str2[i])) {
                    num++;
                }
            }
            if (num == 1) {
                unique += str2[i];
            }

        }

        return unique;
    }

}





/*
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */