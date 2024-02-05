package derya;

public class Week1_Q03 {

    public static void main(String[] args) {
        finra(45);
        finra2(30);


    }

    public static void finra(int n){
        for (int i = 1; i <=n; i++) {
            if(i % 15 == 0){
                System.out.println("FINRA");
            }else if(i % 3 ==0){
                System.out.println("FIN");
            }else if(i % 5 == 0){
                System.out.println("RA");
            }else{
                System.out.println(i);
            }

        }
    }

    public static void finra2(int n){

        for(int i =1; i<=n; i++){

            String result = "";

            if(i % 3 == 0){
                result += "FIN";
            }
            if( i% 5 == 0){
                result += "RA";
            }
            System.out.println(result.isEmpty() ? i : result);
        }
    }


}

/*week1->3-
Write a function which prints out the numbers
     from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and
     for numbers which are a multiple of 5, print "RA" instead of the number.
     For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */
