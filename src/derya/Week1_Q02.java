package derya;

public class Week1_Q02 {
    public static void main(String[] args) {

        divide(6,2);


    }
    public static void divide(int n1, int n2){
        if(n2 == 0){
            System.err.println("CANNOT DIVIDE BY ZERO");
            return;
        }

        int count = 0;
        String result =n1 + " / " + n2 + " is ";

        while(n1 >= n2){
            count++;
            n1 -= n2;
        }
        System.out.println(result + count + " with a remainder "+ n1);
    }


}
/*
week1-> 2-Write a method that can divide two numbers without using division operator
 */
