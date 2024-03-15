package UserPackage;
import TaskPackage.Task;
import UtilityPackage.Utils;
import java.util.Scanner;
import java.util.ArrayList;
public class User {

    //variables

    Scanner scanner = new Scanner(System.in);
    private String Username;
    private String Password;
    public String first_name;
    public String last_name;
    public String Email;
    public int Streak;
    static ArrayList < Task > task_list = new ArrayList < > ();

    //methods

    public Task createTask(String task, User user, double st, double ft, String color) {
        if (isTaskRepetitive(task)) {
            System.out.print("Task name is Repetitious!");
            return null;
        } else {
            Task taskobj = new Task(task, user, st, ft, color);
            task_list.add(taskobj);
            return taskobj;
        }
    }
    public String getFullName() {
        return this.first_name + " " + this.last_name;
    }
    public void setPassword(String password) {
        if (Utils.isPasswordValid(password)) {
            this.Password = password;
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
    public void setFirstName(String fn) {
        if (fn == null) {
            System.out.println(" first name can't be empty!");
            setFirstName(scanner.next());
        } else {
            this.first_name = fn;
        }
    }
    public String getFirstName() {
        return this.first_name;
    }
    public void setLastName(String ln) {
        if (ln == null) {
            System.out.println(" Last name can't be empty!");
            setLastName(scanner.next());
        } else {
            this.last_name = ln;
        }
    }
    public String getLastName() {
        return this.last_name;
    }
    public void setEmail(String e) {
        if (e == null) {
            System.out.println(" Email can't be empty!");
            setLastName(scanner.next());
        } else {
            this.Email = e;
        }
    }
    public String getEmail() {
        return this.Email;
    }

    // Constructor

    public User(String username, String Pass, String fn, String ln, String email) {
        this.Streak = 0;
        setPassword(Pass);
        setUsername(username);
        setFirstName(fn);
        setLastName(ln);
        setEmail(email);
    }
    private static boolean isTaskRepetitive(String task) {
        for (Task obj: task_list) {
            if (obj.name.equals(task)) {
                return true;
            }
        }
        return false;
    }
}