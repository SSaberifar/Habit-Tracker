package Utils;

import java.util.regex.Pattern;

public class Utility {
    public static boolean isPasswordValid(String password) {
        boolean haschar = false;
        boolean hasdigit = false;
        for (char ch : password.toCharArray()) {
            if (Character.isLetter(ch)) {
                haschar = true;
            } else if (Character.isDigit(ch)) {
                hasdigit = true;
            }
        }
        return hasdigit && haschar;
    }

    public static boolean isEmailValid(String email) {
        return Pattern.matches("[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+", email);
    }
}