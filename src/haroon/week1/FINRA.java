package haroon.week1;

public class FINRA {
    public static void main(String[] args) {
//        printFINRA();

        int n = 30;
        boolean by3 = n % 3 == 0;
        boolean by5 = n % 5 == 0;
        String result = "";

        if(by3 && by5){
            result = "FINRA";
        } else if(by3){
            result = "FIN";
        } else if(by5){
            result = "RA";
        } else {
            result = "" + n;
        }

        System.out.println(result);
    }
//
//    public static void printFINRA() {
//        for (int i = 1; i <= 30; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FINRA");
//            } else if (i % 3 == 0) {
//                System.out.println("FIN");
//            } else if (i % 5 == 0) {
//                System.out.println("RA");
//            } else {
//                System.out.println(i);
//            }
//        }
//    }

}
