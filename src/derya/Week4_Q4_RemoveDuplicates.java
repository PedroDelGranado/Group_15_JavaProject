package derya;

public class Week4_Q4_RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AABBCCDDFF";
        String result ="";

        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(!result.contains(ch+"")){
                result += ch;
            }
        }
        System.out.println(result);


    }
}
/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */
