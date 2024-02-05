package derya;

public class Week1_Q01 {
    public static void main(String[] args) {
        identify(5);
        identify(6);

    }

    public static void identify(int num){
        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

}
/*
week1-> 1-Write  a method which can identify given number is even or odd
         Output ex:
         identify(5); ->"Odd"
         identify(6); ->"Even"
 */


