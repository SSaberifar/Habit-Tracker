package TaskPackage;
import UserPackage.User;
import java.util.Scanner;
public class Task {

    //variables

    Scanner scan = new Scanner(System.in);
    private User user;
    private String color;
    public String name;
    private double start_time;
    private double finish_time;

    //methods

    public double getDuration() {
        return this.finish_time - this.start_time;
    }
    private void setFinishTime(double Ft) {
        if (Ft < 0) {
            System.out.println("please enter valid number!");
            setStartTime(scan.nextDouble());
        } else if (Ft <= start_time) {
            System.out.println("please enter valid number!");
            setStartTime(scan.nextDouble());
        } else {
            this.finish_time = Ft;
        }
    }
    public double getFinishTime() {
        return this.finish_time;
    }
    private void setStartTime(double St) {
        if (St < 0) {
            System.out.println("please enter valid number!");
            setStartTime(scan.nextDouble());
        } else {
            this.start_time = St;
        }
    }
    public double getStartTime() {
        return this.start_time;
    }
    public void setUser(User Use) {
        this.user = Use;
    }
    private void setColor(String C) {
        if (isColorValid(C))
            color = C;
    }
    private void setName(String taskName){
        if(taskName.length()<=10){
            this.name = taskName;
        }else{
            System.out.println("please enter valid name!");
            setName(scan.next());
        }
    }
    public String getName(){
        return this.name;
    }
    public String getColor() {
        return this.color;
    }
    public Task(String task, User u, double S, double F, String Color) {
        this.setName(task);
        this.setUser(u);
        this.setFinishTime(F);
        this.setStartTime(S);
        this.setColor(Color);
    }
    public Task(String task, User u, double S, double F) {
        this.setName(task);
        this.setUser(u);
        this.setFinishTime(F);
        this.setStartTime(S);
    }
    public boolean isColorValid(String color) {
        for (int i = 0; i < color.length(); i++) {
            if (color.charAt(i) < 48 || (color.charAt(i) > 57 && color.charAt(i) < 65) || color.charAt(i) > 70) {
                return false;
            }
        }
        return true;
    }
}