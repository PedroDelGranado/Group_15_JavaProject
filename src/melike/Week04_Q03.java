package melike;

public class Week04_Q03 {

    public static void main(String[] args) {

        String str = "AABBCCDDEFF";
        String result = "";


        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);


            if(!result.contains(ch + "")){
                result+= ch;
            }

        }

        System.out.println(result);

    }

}
