import java.util.*;
public class Ex1 {
    public static void main(String[] args){
        ArrayList<Student> stu = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);
        int count = 0;
            for(int i=0; i<=count+1;i++){
                System.out.println("Student #"+(i+1));
                System.out.print("Id: ");
                int id = input.nextInt();
                input.nextLine();
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.print("Age: ");
                int age = input.nextInt();
                input.nextLine();
                stu.add(new Student(id, name, age));
                count++;
                System.out.print("Do you want to add more (y/n)?: ");
                char choice = input.next().charAt(0);
                if(choice == 'n' || choice == 'N'){
                    break;
                }
            }
             System.out.println("===========================");
                    System.out.printf("| %-3s | %-10s | %-3s |\n","ID", "Name", "Age");
                    System.out.println("============================");
            for(int  j=0 ;j<count;j++){
                Student s = stu.get(j);
                    System.out.printf("| %-3s | %-10s | %-3s |\n",s.id, s.name,s.age );
                    
            }
            System.out.println("===========================");

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