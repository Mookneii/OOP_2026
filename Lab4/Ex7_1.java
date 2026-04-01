class itStudent{
	int id;
	String name;
	String gender;
	itStudent(int id,String name,String gender){
		this.id = id;
		this.gender = gender;
		this.name = name;
	}
	void display() {
		System.out.println("Welcome to IT Department.");
	}
}
class programmingStudent extends itStudent{
	String language;
	programmingStudent(int id, String name, String gender,String language) {
		super(id, name, gender);
		// TODO Auto-generated constructor stub
		this.language = language;
	}
	void display() {
		super.display();
		System.out.println("We are Programming student.");
		System.out.println("We use "+ language+" to write code.");
	}
	
	
}
class telecomStudent extends itStudent{
	String role;
	telecomStudent(int id, String name, String gender,String role) {
		super(id, name, gender);
		// TODO Auto-generated constructor stub
		this.role = role;
	}
	void display() {
		super.display();
		System.out.println("We are Telecom student.");
		System.out.println("We learn how to "+ role);
	}
	
}
public class Ex7_1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  itStudent x1 = new itStudent(001, "Vathanak", "Male");
		    programmingStudent x2 = new programmingStudent(002, "Sopha", "Female", "Java");
		    telecomStudent x3 = new telecomStudent(003, "Dara", "Male", "install network systems");

		    System.out.println("--- IT Student ---");
		    x1.display();

		    System.out.println("\n--- Programming Student ---");
		    x2.display();
		    System.out.println("ID: " + x2.id + " | Name: " + x2.name + " | Gender: " + x2.gender + " | Language: " + x2.language);

		    System.out.println("\n--- Telecom Student ---");
		    x3.display();
		    System.out.println("ID: " + x3.id + " | Name: " + x3.name + " | Gender: " + x3.gender + " | Role: " + x3.role);

		
	}

}