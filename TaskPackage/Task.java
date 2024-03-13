package TaskPackage;
import UserPackage.User;
import java.util.Scanner;
public class Task {
    Scanner scan  = new Scanner(System.in);
    private User user;
    private String color;
    public String name;
    private double start_time;
    private double finish_time;
    public double getDuration(){
        return this.finish_time - this.start_time;
    }
    private void setFinishTime(double Ft){
        if(Ft<0){
            System.out.println("please enter valid number!");
            setFinishTime(scan.nextDouble());
        }else{
            this.finish_time = Ft;
        }
    }
    private void setStartTime(double St){
        if(St<0){
            System.out.println("please enter valid number!");
            setStartTime(scan.nextDouble());
        }else{
            this.start_time = St;
        }
    }
    private void setUser(User Use){
        this.user = Use;
    }
    private void setColor(String C){
        color = C;
    }
    private String getColor(){
        return this.color;
    }
    public Task(String task,User u,double F,double S,String Color){
        this.name = task;
        this.setUser(u);
        this.setFinishTime(F);
        this.setStartTime(S);
        this.setColor(Color);
    }
    public Task(String task,User u,double F,double S){
        this.name = task;
        this.setUser(u);
        this.setFinishTime(F);
        this.setStartTime(S);
    }
    public boolean isColorValid(String color){
        for(int i=0;i<color.length();i++){
            if(color.charAt(i)< 48 || (color.charAt(i)>57 && color.charAt(i)<65) || color.charAt(i)> 70){
                return false;
            }
        }
        return false;
    }
}
