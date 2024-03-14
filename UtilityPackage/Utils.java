package UtilityPackage;
public class Utils {


    //Check if the character has digit & letter
    public static boolean isPasswordValid(String password){

        boolean haschar = false;
        boolean hasdigit = false;
        for (char ch : password.toCharArray()){
            if(Character.isLetter(ch)){
                haschar = true;
            } else if (Character.isDigit(ch)) {
                hasdigit = true;
            }
        }
        return  hasdigit && haschar;
    }


}
