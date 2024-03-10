package AliDemir;

public class Week1_Qall {



    public static void main(String[] args) {

        System.out.println(identifyNumber(5));
        System.out.println("=============================================");
        System.out.println(divide(15, 4) +" approximately"); // Outputs 5
        System.out.println("=============================================");
        printFinra();
    }

    public static String identifyNumber(int numer){
        if(numer % 2 ==0){
            return "Even";
        }else{
            return "Odd";
        }

    }

    public static double divide(int dividend, int divisor) {
        if (divisor == 0) {
            System.err.println("Divisor cannot be zero.");
            System.exit(1);
        }

        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1; // identify the sign for result
        dividend = Math.abs(dividend); // take absolute value of number
        divisor = Math.abs(divisor); // take absolute value of number, if number negative change it ot positive

        int quotient = 0;  // bölüm
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        int fraction = 0;
        double remainderDecimal = 0;
        if (dividend != 0){ //kalan var mı kontrol et

            dividend = dividend*10;  // kalanı 10 ile çarp ki tekrar bölebil, eğer 100 ile çarpsaydık 2 decimal rakam elde edecektim ama şimdilik 1 decimal yeterli
            while (dividend >= divisor) {
                dividend -= divisor; // burada decimal digit i elde ediyoruz
                fraction++;
            }

            String decimal = "0."+fraction; // make it decimal without using
            remainderDecimal =  Double.parseDouble(decimal);  // double a çevir
            System.out.println("remainderDecimal = " + remainderDecimal);
        }

        return sign * quotient + sign * remainderDecimal;
    }

    public static void printFinra() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

/*
1. Numbers -- odd & even
Write a method which can identifies given number is even or odd

EX:
  identify(5) -> "Odd"
  identify(6) -> "Even"

2. Numbers - - Divide without / operator
Write a method that can divide two numbers without using division operator

3. FINRA :
Write a method which prints out the numbers from 1 to 30, but print "FIN" instead of numbers for multiples of 3, "RA" instead of numbers for numbers that are multiples of 5, and a multiple of both 3 and 5 for "FINRA" instead of the number.
 */


