
class Sers {
    int id;
    String name;
    String gender;
    int age;
    String major;

    public Sers(int id, String name, String gender, int age, String major) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.major = major;
    }

    @Override
    public String toString() {
        return name; 
    }
}

// Node.java — the "link" between students 
class Node {
    Sers data;
    Node next;

    public Node(Sers data) {
        this.data = data;
        this.next = null;
    }
}

// StudentList.java — a singly linked list
class StudentList {
    private Node head;
    private int size;
    private int idCounter = 1;

    public StudentList() {
        head = null;
        size = 0;
    }

    // Add a student by name to the LAST position
    public void add(String name) {
        Sers s = new Sers(idCounter++, name, "N/A", 0, "N/A");
        Node newNode = new Node(s);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Remove at a specific index (0-based)
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index is out of range");
            return;
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    // Remove the LAST element
    public void removeLast() {
        if (head == null) {
            System.out.println("Array is emply");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    // Clear ALL elements
    public void clear() {
        head = null;
        size = 0;
    }

    // Display all students
    public void display() {
        if (head == null) {
            System.out.println("Array is emply");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data.name);
            if (current.next != null) System.out.print(" ");
            current = current.next;
        }
        System.out.println();
    }
}

// Main.java
public class Ex6 {
    public static void main(String[] args) {

        StudentList myArr = new StudentList();

        System.out.println("==> Add");
        myArr.add("Makara");
        myArr.add("Kompheak");
        myArr.display();

        myArr.removeLast();
        myArr.add("Minea");
        myArr.add("Mehsa");
        myArr.display();

        System.out.println("\n==> Remove at larger index");
        myArr.remove(10);

        System.out.println("==> Clear all element");
        myArr.clear();
        myArr.display();
    }
}