package vera;

public class Week06_Q02 {
    public static void main(String[] args) {

        String p1 = "123e@";
        System.out.println("validPassword(p1) = " + validPassword(p1));
        String p2 = "1As eg@";
        System.out.println("validPassword(p2) = " + validPassword(p2));
        String p3 = "1As_eg@";
        System.out.println("validPassword(p3) = " + validPassword(p3));

        String p4 = "Cyd1%K";
        System.out.println("validPassword(p4) = " + validPassword(p4));


    }

    public static boolean validPassword(String password){

        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUppercaseLetter = false;
        boolean hasLowercaseLetter = false;
        boolean hasSpecialCharacter = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercaseLetter = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercaseLetter = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {

                if (!Character.isLetterOrDigit(ch)) {
                    hasSpecialCharacter = true;
                }
            }
        }

        return hasUppercaseLetter && hasLowercaseLetter && hasSpecialCharacter && hasDigit;
    }
}
/*
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false
*/