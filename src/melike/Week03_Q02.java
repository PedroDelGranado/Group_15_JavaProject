package melike;

public class Week03_Q02 {

    public static void main(String[] args) {

        System.out.println(reverseNegative(-1678));
        System.out.println(reverseNegative(-87569));
        System.out.println(reverseNegative(12345));
    }

    public static int reverseNegative(int num) {

        if (num < 0) {
            num *= -1;

            int reversedNum = 0;

            while (num != 0) {

                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }

            return -1 * reversedNum;

        } else {

            return num;
        }
    }
}
/*
Write a return method that can reverse negative number and return it as int
 */
