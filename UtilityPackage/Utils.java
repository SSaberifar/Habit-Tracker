package UtilityPackage;
public class Utils {
    public boolean isPasswordValid(String password){
        if(password.matches("[0-9A-Z]")){
            return true;
        }else return password.matches("[0-9a-z]");
    }
}
