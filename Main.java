import TaskPackage.Task;
import UserPackage.User;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Taking user input and creating a user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = scan.next();
        System.out.println("Enter your password: ");
        String password = scan.next();
        System.out.println("Enter your first name: ");
        String first_name = scan.next();
        System.out.println("Enter your last name: ");
        String last_name = scan.next();
        System.out.println("Enter your email: ");
        String email = scan.next();

        User user = new User(username, password, first_name, last_name, email);

        // Displaying the user info
        System.out.println("---User Created---");
        System.out.println("Welcome " + user.getFullName() + "!");
        printUserInfo(user);

        // Creating task for a specific user
        System.out.println("Would you like to create a task? (y/n)");
        char answer = scan.next().charAt(0);
        if (answer == 'y') {
            System.out.println("Creating task...");
            System.out.println("Enter your taskname: ");
            String task_name = scan.next();
            System.out.println("Enter your user: ");
            System.out.println("Enter your start time: ");
            double start_time = scan.nextDouble();
            System.out.println("Enter your finish time: ");
            double finish_time = scan.nextDouble();
            System.out.println("Enter your color: ");
            String color = scan.next();
            Task task1 = user.createTask(task_name, user, start_time, finish_time, color);
            DecimalFormat df = new DecimalFormat("##.00");
            System.out.println(task1.name + " duration: " + df.format(task1.getDuration()));
        }

        // Changing username and password with setter methods
        System.out.println("Would you like to change your username and password? (y/n)");
        answer = scan.next().charAt(0);
        if (answer == 'y') {
            System.out.println("Changing username and password...");
            System.out.println("Enter new username: ");
            String username2 = scan.next();
            user.setUsername(username2);
            System.out.println("Enter new password: ");
            String password2 = scan.next();
            user.setPassword(password2);
            // Changing the streak
            user.Streak = 2;
            printUserInfo(user);
        }

        // Closing the Scanner
        scan.close();
    }

    public static void printUserInfo(User user) {
        System.out.println("Username: " + user.getUsername() + "\nFull name: " + user.getFullName() +
                "\nPassword: " + user.getPassword() + "\nEmail: " + user.getEmail() + "\nYou have been using the app for " + user.Streak + " days.");
    }
}