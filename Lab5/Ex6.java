import java.io.*;
import java.util.*;

public class Ex6 {

    static Scanner sc = new Scanner(System.in);
    static final String FILE_NAME = "user.txt";

    public static void main(String[] args) {

        while (true) {
            System.out.println("==== Menu ====");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Quit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    System.out.println("Bye!");
                    return;
            }
        }
    }

    // ================= REGISTER =================
    static void register() {
        try {
            System.out.println("==== Register a new user ====");

            System.out.print("First Name: ");
            String first = sc.nextLine();

            System.out.print("Last Name: ");
            String last = sc.nextLine();

            System.out.print("Username: ");
            String username = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Password: ");
            String password = sc.nextLine();

            FileWriter fw = new FileWriter(FILE_NAME, true);
            fw.write(first + "," + last + "," + username + "," + email + "," + password + "\n");
            fw.close();

            System.out.println("\nYou are successfully registered~\n");

        } catch (IOException e) {
            System.out.println("Error saving user.");
        }
    }

    // ================= LOGIN =================
    static void login() {
        System.out.println("==== Login ====");

        System.out.print("Email or Username: ");
        String input = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        boolean found = false;

        try {
            File file = new File(FILE_NAME);

            if (!file.exists()) {
                System.out.println("No users found.");
                return;
            }

            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] data = line.split(",");

                String first = data[0];
                String last = data[1];
                String username = data[2];
                String email = data[3];
                String pass = data[4];

                if ((input.equals(username) || input.equals(email)) && password.equals(pass)) {
                    System.out.println("\n========= User Info =========");
                    System.out.println("Hi " + first + " " + last + ",");
                    System.out.println("Your username is: " + username);
                    System.out.println("Your email is: " + email);
                    found = true;
                    break;
                }
            }

            reader.close();

            if (!found) {
                System.out.println("User not found. Please try again\n");
            }

        } catch (Exception e) {
            System.out.println("Error reading file.");
        }
    }
}