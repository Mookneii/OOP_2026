import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class MyDate {
    public void getCurrentDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Current datetime is: " + now.format(format));
    }

    public void calculateDaysBtwDates(String d1, String d2) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.parse(d1, format);
        LocalDate date2 = LocalDate.parse(d2, format);
        long days = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Difference between two dates is: " + days + " days");
    }

    public void findDay(String d) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(d, format);
        System.out.println("The day is: " + date.getDayOfWeek());
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyDate md = new MyDate();

        while (true) {
            System.out.println("\n1. Current date and time");
            System.out.println("2. Calculate days btw two dates");
            System.out.println("3. Find day");
            System.out.println("4. Quit");
            int opt = sc.nextInt();
            sc.nextLine();

            if (opt == 1) md.getCurrentDate();
            else if (opt == 2) {
                System.out.print("First date: ");
                String d1 = sc.nextLine();
                System.out.print("Second date: ");
                String d2 = sc.nextLine();
                md.calculateDaysBtwDates(d1, d2);
            }
            else if (opt == 3) {
                System.out.print("Input date: ");
                String d = sc.nextLine();
                md.findDay(d);
            }
            else break;
        }
    }
}