package pedro;

public class OddOrEven {
    public static void main(String[] args) {

        identify(3);

    }

    public static void identify(int num){
        if(num % 2 == 0){
            System.out.println(num+ " is even!");
        }else{
            System.out.println(num + " is odd!");
        }
    }


}
