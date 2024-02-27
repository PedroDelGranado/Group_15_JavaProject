package kerim;

public class Week03_Question02 {

    public static int reverseNegative(int number){
        if (!(number < 0)){
            throw new RuntimeException("This method works only with negative numbers");
        }

        String str = ""+number;
        String reversed = "";
        for (int i = str.length()-1; i >= 1; i--) {
            reversed+= str.charAt(i);
        }
        Integer reversedNum = Integer.parseInt(reversed);
        return -reversedNum;
    }

}

/*
Write a return method that can reverse negative number and return it as int
 */