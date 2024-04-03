package melike;

public class Week06_Q02 {

    public static void main(String[] args) {
        // Test cases
        String password1 = "Password123!";
        String password2 = "Passwrd";
        String password3 = "password!";

        System.out.println(isValidPassword(password1)); // Output: true
        System.out.println(isValidPassword(password2)); // Output: false
        System.out.println(isValidPassword(password3)); // Output: false
    }

    public static boolean isValidPassword(String password) {
        // Check if password length is at least 6 characters and does not contain space

        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUpperCase = false;

        boolean hasLowerCase = false;

        boolean hasSpecialChar = false;

        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
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