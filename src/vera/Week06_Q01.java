package vera;

public class Week06_Q01 {
    public static void main(String[] args) {

        System.out.println(sumOfDigits("12 java 5 apple 3"));

    }

    public static int sumOfDigits(String str) {
        int sum = 0;
        String[] arr = str.split(" ");
        for (String each : arr) {
            try {
                int num = Integer.parseInt(each);
                sum += num;
            } catch (NumberFormatException ignored) {
            }
        }
        return sum;
    }
}

/*
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
*/
