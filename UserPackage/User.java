package UserPackage;
import TaskPackage.Task;
import UtilityPackage.Utils;

import java.util.Scanner;
import java.util.ArrayList;
public class User {
    Scanner scanner = new Scanner(System.in);
    private String Username;
    private String Password;
    public String first_name;
    public String last_name;
    public String email;
    public int streak;

    ArrayList<Task> tasklist = new ArrayList<>();


    public Task createTask(String task , User user , double ft,double st , String color) {

        if( isTaskRepetitive(task) ){
            System.out.print("Task name is Repetitious!");
            return null;
        }
        else {
            Task taskobj = new Task(task , user,ft,st, color);

            tasklist.add(taskobj);
            return taskobj;
        }

    }

    public String getFullName() {
        return this.first_name + " " + this.last_name;
    }

    public void setPassword(String password) {

        // Check if password is valid
        if( Utils.isPasswordValid(password) ) {
            this.Password = password ;
        }
    }

    public String getPassword() {
        return this.Password;
    }

    public void setUsername(String username) {
        if (username == null) {
            System.out.println(" Username can't be empty!");
        } else {
            this.Username = username;
        }
    }

    public String getUsername() {
        return this.Username;
    }

    private void setfirstname(String fn){
        if( fn == null){
            System.out.println(" first name can't be empty");
            setfirstname(scanner.next());
        }else {
            this.first_name = fn;
        }
    }

    private String getfirstname(){
        return  this.first_name;
    }

    private void setlastname( String ln){
        if( ln == null){
            System.out.println(" Last name can't be empty");
            setlastname(scanner.next());
        }else {
            this.last_name = ln;
        }
    }

    private String getlastname(){
        return  this.last_name;
    }

    // Constructor
    public User(String username, String Pass, String fn, String ln, String email) {
        this.streak = 0;
        setPassword(Pass);
        setUsername(username);
        setfirstname(fn);
        setlastname(ln);
    }

    private boolean isTaskRepetitive(String task) {
        for (Task obj : tasklist) {
            if (obj.name.equals(task)){
                return true;
            }
        }
        return false;
    }
}
