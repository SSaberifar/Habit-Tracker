package TaskPackage;

public class Task {
    public String name;
    public double start_time;
    public double finish_time;
    public double getDuration(){
        return this.finish_time - this.start_time;
    }
    public Task(String task){
        this.name = task;
        this.finish_time = 0;
        this.start_time = 0;
    }
}
