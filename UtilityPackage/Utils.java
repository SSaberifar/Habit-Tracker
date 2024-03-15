package UtilityPackage;
public class Utils {
    public static boolean isPasswordValid(String password) {
        boolean haschar = false;
        boolean hasdigit = false;
        for (char ch: password.toCharArray()) {
            if (Character.isLetter(ch)) {
                haschar = true;
            } else if (Character.isDigit(ch)) {
                hasdigit = true;
            }
        }
        return hasdigit && haschar;
    }
}