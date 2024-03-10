package derya;

public class Week4_Q1_Frequency_of_Characters {

    public static void main(String[] args) {

        String str = "aaabbbccddff";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); //a a a b b
            int count = 0;

            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)== ch){
                    count++;
                }
            }

            if(result.contains(ch+"")){
                continue;
            }
            result += ch+""+count;
        }

        System.out.println(result);

    }
}
//
//        String str = "acbacbc";
//        char ch = 'c';
//
//         int count = 0;
//
//         for(int i=0; i< str.length(); i++){
//             if(str.charAt(i)==ch){
//                 count++;
//             }
//         }
//        System.out.println(count);



/*Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

 */
