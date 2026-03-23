import java.util.Scanner;

public class Ex4 {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        Student[] stu = new Student[99];
        int count=0;
        for(int i = 0; i< 99;i++){
            System.out.println("Student #"+(i+1)+":");
            System.out.print("Id: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
           
            System.out.print("Age: ");
            int age = input.nextInt();
           
            stu[i] = new Student(id, name, age);
            count++;
            System.out.println("Do you want to add more (y/n): ");
            char choice = input.next().charAt(0);
            if( choice == 'n'){
                break;
            }
        }
        System.out.println("================================");
System.out.printf("| %-3s | %-3s | %-10s | %-3s |\n", "No", "ID", "Name", "Age");
System.out.println("================================");

for(int j = 0; j < count; j++) {
    System.out.printf("| %-3d | %-3d | %-10s | %-3d |\n",
                      j + 1,
                      stu[j].id,
                      stu[j].name,
                      stu[j].age);
}

System.out.println("================================");
   } 
}
class Student{
    int id;
    String name;
    int age;
    Student(){}
    Student(int id, String name, int age){
        this.age = age;
        this.name = name;
        this.id = id;

    }
}