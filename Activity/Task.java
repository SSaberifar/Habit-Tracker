package Activity;

public class Task extends ToDo {
    private double finish_time;

    public double getDuration() {
        return finish_time - start_time;
    }

    public void setFinishTime(double Ft) {
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

    public double getFinish_time() {
        return finish_time;
    }

    public Task(double ft) {
        setFinishTime(ft);
    }

    public Task() {

    }

    public String getInfo() {
        return super.getInfo() + " finish time : " + getFinish_time() + " duration : " + getDuration();
    }
}