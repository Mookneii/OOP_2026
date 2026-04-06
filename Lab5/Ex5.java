import java.io.*;
import java.util.*;

public class Ex5 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("---- Menu ----");
            System.out.println("1. View all");
            System.out.println("2. Add new");
            System.out.println("3. Quit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    viewAll();
                    break;
                case 2:
                    addNew();
                    break;
                case 3:
                    System.out.println("Exit program.");
                    return;
            }
        }
    }

    // ================= ADD =================
    static void addNew() {
        System.out.println("==== Add new resource ====");
        System.out.println("1. Teacher");
        System.out.println("2. Student");
        System.out.println("3. Security guard");
        System.out.print("Choose: ");
        int opt = sc.nextInt();
        sc.nextLine();

        System.out.print("First Name: ");
        String first = sc.nextLine();
        System.out.print("Last Name: ");
        String last = sc.nextLine();
        System.out.print("Sex: ");
        String sex = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        try {
            if (opt == 1) {
                System.out.print("Subject: ");
                String subject = sc.nextLine();
                System.out.print("Salary: ");
                double salary = sc.nextDouble();

                saveToFile("teacher.txt",
                        first + "," + last + "," + sex + "," + email + "," + subject + "," + salary);

            } else if (opt == 2) {
                System.out.print("Year: ");
                int year = sc.nextInt();
                sc.nextLine();
                System.out.print("Major: ");
                String major = sc.nextLine();

                saveToFile("student.txt",
                        first + "," + last + "," + sex + "," + email + "," + year + "," + major);

            } else if (opt == 3) {
                System.out.print("Role: ");
                String role = sc.nextLine();

                saveToFile("security.txt",
                        first + "," + last + "," + sex + "," + email + "," + role);
            }

            System.out.println("Saved successfully!\n");

        } catch (Exception e) {
            System.out.println("Error saving data.");
        }
    }

    // ================= VIEW =================
    static void viewAll() {
        System.out.println("==== Teacher ====");
        readFile("teacher.txt");

        System.out.println("\n==== Student ====");
        readFile("student.txt");

        System.out.println("\n==== Security Guard ====");
        readFile("security.txt");

        System.out.println();
    }

    // ================= FILE WRITE =================
    static void saveToFile(String filename, String data) throws IOException {
        FileWriter fw = new FileWriter(filename, true);
        fw.write(data + "\n");
        fw.close();
    }

    // ================= FILE READ =================
    static void readFile(String filename) {
        try {
            File file = new File(filename);
            if (!file.exists()) {
                System.out.println("No data.");
                return;
            }

            Scanner reader = new Scanner(file);
            int i = 1;

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(i + ". " + format(line));
                i++;
            }

            reader.close();

        } catch (Exception e) {
            System.out.println("Error reading file.");
        }
    }

    // ================= FORMAT OUTPUT =================
    static String format(String data) {
        String[] d = data.split(",");

        if (d.length == 6) {
            return "[" + d[0] + " " + d[1] + "][" + d[2] + "][" + d[3] + "][" + d[4] + "][" + d[5] + "]";
        }
        return data;
    }
}