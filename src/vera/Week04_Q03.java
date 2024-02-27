package vera;

public class Week04_Q03 {

    public static void main(String[] args) {

        String str = "AAABBBCCC";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (result.contains("" + str.charAt(i))) {
                continue;
            }

            result += str.charAt(i);
        }
        System.out.println(result);


    }
}
/*Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC*/