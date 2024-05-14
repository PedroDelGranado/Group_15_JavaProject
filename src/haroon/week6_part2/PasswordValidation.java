package haroon.week6_part2;

public class PasswordValidation {

    // first solution

//    public static void main(String[] args) {
//        System.out.println(isValidPassword("Abcdef1@")); // Output: true
//        System.out.println(isValidPassword("Password")); // Output: false (no digit)
//        System.out.println(isValidPassword("short")); // Output: false (length < 6)
//        System.out.println(isValidPassword("no_special_characters")); // Output: false (no special character)
//    }
//
//    public static boolean isValidPassword(String password){
//        return password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z0-9])(?!.*\\s).{6,}$");
//    }



    // second solution

    public static boolean isValidPassword(String password) {
        return hasMinimumLength(password) &&
                hasNoWhitespace(password) &&
                hasUppercaseLetter(password) &&
                hasLowercaseLetter(password) &&
                hasSpecialCharacter(password) &&
                hasDigit(password);
    }

    private static boolean hasMinimumLength(String password) {
        return password.length() >= 6;
    }

    private static boolean hasNoWhitespace(String password) {
        return password.contains(" ");
    }

    private static boolean hasUppercaseLetter(String password) {
        return !password.equals(password.toLowerCase());
    }

    private static boolean hasLowercaseLetter(String password) {
        return !password.equals(password.toUpperCase());
    }

    private static boolean hasSpecialCharacter(String password) {
        return !password.matches("[A-Za-z0-9]*");
    }

    private static boolean hasDigit(String password) {
        return password.matches(".*\\d.*");
    }

    public static void main(String[] args) {
        System.out.println(isValidPassword("Abcdef1@ ")); // Output: true

    }


}



