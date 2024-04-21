package Activity;

public class Habit extends ToDo {
    private int frequency;
    private String category;

    public String getInfo() {
        return super.getInfo() + "frequency : " + getFrequency() + " category : " + getCategory();
    }

    public Habit(int fre, String cat) {
        setCategory(cat);
        setFrequency(fre);
    }

    public Habit() {

    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStartTime(double St) {
        if (St < 0) {
            System.out.println("please enter valid number!");
            setStartTime(scan.nextDouble());
        } else {
            this.start_time = St;
        }
    }
}
