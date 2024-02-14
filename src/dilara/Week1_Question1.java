package dilara;

public class Week1_Question1 {

    public static void main(String[] args) {

        identifyOddOrEven(5);
        identifyOddOrEven(6);
        identifyOddOrEven(0);

    }

    public static void identifyOddOrEven(double num){

        String result = " ";
        if(num % 2 == 0){

            result = "Even";

        }else{

            result = "Odd";

        }

        System.out.println(result);


    }
}
//Question_01
//        ```
//        Write  a method which can identify given number is even or odd
//        Output ex:
//        identify(5); ->"Odd"
//        identify(6); ->"Even"
//
