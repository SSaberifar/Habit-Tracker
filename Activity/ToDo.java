package Activity;

import User.User;

import java.util.Scanner;

public class ToDo {
    Scanner scan = new Scanner(System.in);
    User user;
    public String name;
    protected double start_time;
    protected String color;

    public void setStartTime(double St) {
        if (St < 0) {
            System.out.println("please enter valid number!");
            setStartTime(scan.nextDouble());
        } else {
            this.start_time = St;
        }
    }

    public String getInfo() {
        return "name : " + name + " Start Time : " + start_time;
    }

    protected void setColor(String C) {
        boolean sw = true;
        for (int i = 0; i < color.length(); i++) {
            if (color.charAt(i) < 48 || (color.charAt(i) > 57 && color.charAt(i) < 65) || color.charAt(i) > 70) {
                System.out.println("the color is invalid");
                sw = false;
                break;
            }
        }
        if (sw) {
            color = C;
        }
    }

    public void setName(String taskName) {
        if (taskName.length() <= 10) {
            name = taskName;
        } else {
            System.out.println("please enter valid name!");
            setName(scan.next());
        }
    }

    public String getColor() {
        return this.color;
    }

    public String getName() {
        return name;
    }

    public ToDo(String todo, User user, Double st, String color) {
        setName(todo);
        this.user = user;
        setStartTime(st);
        setColor(color);
    }

    public ToDo() {

    }
}
