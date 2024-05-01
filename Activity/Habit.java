package Activity;

public class Habit extends ToDo {
    private int frequency;
    private String category;

    public Habit(int fre, String cat) {
        setCategory(cat);
        setFrequency(fre);
    }

    public Habit() {

    }

    public String getInfo() {
        return super.getInfo() + "frequency : " + getFrequency() + " category : " + getCategory();
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

}
