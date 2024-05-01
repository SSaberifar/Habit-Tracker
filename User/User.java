package User;
import Utils.Utility;
import java.util.Scanner;
import Activity.ToDo;

public class User {

    Scanner scanner = new Scanner(System.in);
    private String username;
    private String password;
    private int streak;
    static ToDo[] tasks = new ToDo[10];
    private String first_name;
    private String last_name;
    private String Email;

    public boolean isToDoRepetitive(String todo) {
        for (ToDo obj : tasks) {
            if (obj.name.equals(todo)) {
                return true;
            }
        }
        return false;
    }

    public void createTodo(String todo, User user, double st, double ft, String color) {
        if (isToDoRepetitive(todo)) {
            System.out.print("Task name is Repetitious!");
        } else {
            ToDo todoobj = new ToDo(todo, user, st, color);
            for (ToDo toDo : tasks) {
                if (toDo == null) {
                    toDo = todoobj;
                    break;
                }
            }
        }
    }

    public String getFullName() {
        return this.first_name + " " + this.last_name;
    }

    public ToDo[] getToDosByColor(String todoColor) {
        ToDo[] todo_holder = new ToDo[10];
        int i = 0;

        for (ToDo todo : tasks) {
            if (todoColor.equals(todo.getColor())) {
                todo_holder[i] = todo;
                i++;
            }
        }
        return todo_holder;
    }

    public void setPassword(String password) {
        if (Utility.isPasswordValid(password)) {
            this.password = password;
        } else {
            System.out.println("please enter valid password");
            setPassword(scanner.next());
        }
    }

    public String getPassword() {
        return this.password;
    }

    public void setUsername(String username) {
        if (username == null) {
            System.out.println(" Username can't be empty!");
        } else {
            this.username = username;
        }
    }

    public String getUsername() {
        return this.username;
    }

    public void setFirstName(String fn) {
        StringBuilder finalName = new StringBuilder();
        if (fn == null) {
            System.out.println(" first name can't be empty!");
            setFirstName(scanner.next());
        } else {
            char[] c = fn.toCharArray();
            c[0] = Character.toUpperCase(c[0]);
            finalName.append(c[0]);
            for (int t = 1; t < c.length; t++) {
                c[t] = Character.toLowerCase(c[t]);
                finalName.append(c[t]);
            }
            this.first_name = finalName.toString();
        }
    }

    public String getFirstName() {
        return this.first_name;
    }

    public void setLastName(String ln) {
        StringBuilder finalLName = new StringBuilder();
        if (ln == null) {
            System.out.println(" last name can't be empty!");
            setFirstName(scanner.next());
        } else {
            char[] c = ln.toCharArray();
            c[0] = Character.toUpperCase(c[0]);
            finalLName.append(c[0]);
            for (int t = 1; t < c.length; t++) {
                c[t] = Character.toLowerCase(c[t]);
                finalLName.append(c[t]);
            }
            this.last_name = finalLName.toString();
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
            if (Utility.isEmailValid(e)) {
                this.Email = e;
            } else {
                System.out.println("please enter valid email!");
                setEmail(scanner.next());
            }
        }
    }

    public String getEmail() {
        return this.Email;
    }

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public User(String username, String Pass, String fn, String ln, String email) {
        setStreak(0);
        setPassword(Pass);
        setUsername(username);
        setFirstName(fn);
        setLastName(ln);
        setEmail(email);
    }

    public User(String username, String Pass) {
        setStreak(0);
        setPassword(Pass);
        setUsername(username);
    }

}