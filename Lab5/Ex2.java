import java.util.*;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("==== Menu ===");
            System.out.println("\n1. Add New students");
            System.out.println("2. Delete multiple Students");
            System.out.println("3. Quit");
            int opt = sc.nextInt();

            if (opt == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Age: ");
                int age = sc.nextInt();

                list.add(new Student(id, name, age));
            }

            else if (opt == 2) {
                char more;
                do {
                    System.out.print("Delete ID: ");
                    int id = sc.nextInt();

                    boolean found = false;
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).id == id) {
                            list.remove(i);
                            found = true;
                            System.out.println("Deleted");
                            break;
                        }
                    }

                    if (!found) System.out.println("Not found");

                    System.out.print("More? y/n: ");
                    more = sc.next().charAt(0);

                } while (more == 'y');
            }

            else break;
        }
    }
}