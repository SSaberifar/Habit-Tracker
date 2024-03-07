package UserPackage;
import TaskPackage.Task;
import java.util.Scanner;
public class User {
    Scanner scanner = new Scanner(System.in);
    private String Username ;
    private String Password ;
    public String first_name;
    public String last_name;
    public String email;
    public int streak;

    public Task createTask(){
        String task = scanner.next();
        Task Taskobj = new Task(task);

        return Taskobj;
    }

    public String getFullName(){
        return this.first_name + " "+ this.last_name;
    }

    public void setPassword(String password){
        this.Password = password;
    }

    public String getPassword(){
        return this.Password;
    }

    public void setUsername(String username){
        this.Username = username;
    }

    public String getUsername(){
        return this.Username;
    }

    // Constructor
    public User(String username , String Pass , String fn , String ln , String email){
        this.streak = 0;
        setPassword(Pass);
        setUsername(username);
    }
}
