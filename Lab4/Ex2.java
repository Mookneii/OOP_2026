import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] st = new Student[99];
        int count = 0;
        
        while(true){
            
            System.out.println("==== Menu ===\r\n" + //
                                "1. View all students\r\n" + //
                                "2. Add a new student\r\n" + //
                                "3. Delete a student\r\n" + //
                                "4. Quit\r\n" + //
                                "Choose an option:");
            int ch = input.nextInt();
            input.nextLine();
            switch(ch){
                
                case 1: 
                  System.out.println("=== Student List ===");
                    for (int i = 0; i < count; i++) {
                        if (st[i] != null) {
                            System.out.println("ID: " + st[i].id +
                                               ", Name: " + st[i].name +
                                               ", Age: " + st[i].age);
                        }
                    }
                break;
                case 2:
                System.out.println("Input Data: ");
                System.out.print("Id: ");
                int id = input.nextInt();
                input.nextLine();
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.print("Age: ");
                int age = input.nextInt();
                input.nextLine();
                st[count] = new Student(id, name, age);
                count++;
                break;
                case 3: 
                System.out.print("Enter ID to delete: ");
                int deleteId = input.nextInt();
                input.nextLine();
                for(int i=0; i<count; i++){
                    if(deleteId == st[i].id){
                        st[i] = null;
                        System.out.println("Student with ID " + deleteId +" has been deleted!");
                    }

                }
                break;
                case 4:
                    System.out.println("Program ended!");
                    return;
                default: 
                System.out.println("Invalid Input!");

            }

        }
    }
}
class Student{
    int id;
    String name;
    int age;
    Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
