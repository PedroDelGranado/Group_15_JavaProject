package vera;

public class Week05_Q02 {
    public static void main(String[] args) {

        System.out.println(reverseStr("ABCD"));

    }

    public static String reverseStr(String str) {
        String strR = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strR += str.charAt(i);
        }

    return strR;
    }
}
/*
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
*/