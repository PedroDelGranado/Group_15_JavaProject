package melike;

public class Week01_Q03 {

      /*
    Write a function which prints out the numbers
     from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and
     for numbers which are a multiple of 5, print "RA" instead of the number.
     For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    public static void main(String[] args) {

        finra(30);


    }

    public static void finra(int number){

        String result = "";


        for(int i = 1; i <= number; i++){

            if(i % 15 == 0){
                result += "Finra ";
            }else if(i % 3 == 0){
                result += "Fin ";
            }else if(i % 5 == 0){
                result += "Ra ";
            }else{
                result += i + " ";
            }

        }

        System.out.println(result);

    }



}
