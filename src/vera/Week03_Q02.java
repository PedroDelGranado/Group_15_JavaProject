package vera;

public class Week03_Q02 {

    public static void main(String[] args) {

        int a = -545621;
        System.out.println(reverseNegativeNumber(a));
        int b = 12365;
        System.out.println(reverseNegativeNumber(b));
        int c = -214456;
        System.out.println(reverseNegativeNumber(c));

    }
    public static int reverseNegativeNumber(int num) {

        if (num < 0 ) {
            int reverseNum = 0;

            while (num <0 || num !=0 ){

                int n = num % 10;
                reverseNum = reverseNum * 10 + n;
                num /= 10;

            }
            return reverseNum;

        }
        return num;

    }
}
//Write a return method that can reverse negative number and return it as int
