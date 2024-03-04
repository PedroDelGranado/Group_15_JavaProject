package vera;

public class Week05_Q01 {
    public static void main(String[] args) {

        System.out.println(uniqueCharacters("AAABBBCCCDEF"));
    }

    public static String uniqueCharacters(String str) {
        String[] arr = str.split("");
        String uniqueCh = "";
        for (int i = 0; i < arr.length; i++) {
            int num = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(arr[i])) {
                    num++;
                }
            }
            if (num == 1) {
                uniqueCh += arr[i];
            }

        }

        return uniqueCh;
    }
}





/*
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
*/