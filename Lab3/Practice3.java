class Student{
    private String name;
    private int age;
    public void setStudentInfo(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getStudentInfo(){
        return "Name: "+ name+ ", Age: "+ age;
    }
}
public class Practice3 {
    public static void main(String[] args) {
        int studentTotal = 0;
        Student[] students = new Student[99];
        Student student1 = new Student();
        student1.setStudentInfo("John", 20);
        Student student2 = new Student();
        student2.setStudentInfo("Alice", 22);
        Student student3 = new Student();
        student3.setStudentInfo("Bob", 21);
        Student student4 = new Student();
        student4.setStudentInfo("Eva", 21);
         
        students[0] = student1;
        studentTotal++;
        students[1] = student2;
        studentTotal++;
        students[2] = student3;
        studentTotal++;
        students[3] = student4;
        studentTotal++;
        Student newStudent = new Student();
        newStudent.setStudentInfo("Tola", 18);
        for(int i =0 ;  i < studentTotal; i++){
            if(students[i].getStudentInfo().equals("Name: Alice, Age: 22")){
               students[i].
            }
            System.out.println(students[i].getStudentInfo());
        }       
    }
}
