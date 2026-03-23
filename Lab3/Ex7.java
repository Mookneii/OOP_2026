import java.util.*;
public abstract class Ex7 {
    
    public static void main(String[] args){
        Student[] stu = new Student[99];
        Scanner input = new Scanner(System.in);
        int count = 0;
        while(true){
            
            System.out.println("====== Menu ======\r\n" + //
                                "1. Create a student\r\n" + //
                                "2. List students\r\n" + //
                                "3. Quit\r\n" + //
                                "");
                                System.out.print("Choose an option: ");
                                int ch = input.nextInt();
                                input.nextLine();
            switch (ch) {
                case 1:
                    
                    System.out.println("Student #"+(count+1)+": ");
                    System.out.print("Id: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Name: ");
                    String name = input.nextLine();
                    System.out.print("Age: ");
                    int age = input.nextInt();
                    input.nextLine();
                    stu[count] = new Student(id, name, age);
                    count++;
                    break;
                case 2: 
                    System.out.println("================================");
                    System.out.printf("| %-3s | %-3s | %-10s | %-3s |\n", "No", "ID", "Name", "Age");
                    System.out.println("================================");
                    for(int i =0 ; i<count; i++){
                        System.out.printf("| %-3d | %-3d | %-10s | %-3d |\n",
                      i + 1,
                      stu[i].id,
                      stu[i].name,
                      stu[i].age);
                    }
                     System.out.println("================================\n");
                     
                    break;
                    
                case 3:
                    System.exit(0);

                    
            
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }

        }
    }
}
class Student{
    int id;
    String name;
    int age;
    Student(){

    }
    Student(int id , String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
}