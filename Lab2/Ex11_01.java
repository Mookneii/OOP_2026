class Book {

    int id;
    String title;
    String author;
    int year;
    double price;
}
public class Ex11_01 {
    public static void main(String[] args) {

       
        Book b1 = new Book();
        b1.id = 1;
        b1.title = "Java Basics";
        b1.author = "John";
        b1.year = 2020;
        b1.price = 15.5;

        Book b2 = new Book();
        b2.id = 2;
        b2.title = "Programming";
        b2.author = "Anna";
        b2.year = 2022;
        b2.price = 20.0;

        Book b3 = new Book();
        b3.id = 3;
        b3.title = "Data Structure";
        b3.author = "Mike";
        b3.year = 2021;
        b3.price = 18.0;

       
        Book[] books = new Book[3];
        books[0] = b1;
        books[1] = b2;
        books[2] = b3;

        
        for(int i = 0; i < books.length; i++){
            System.out.println("ID: " + books[i].id);
            System.out.println("Title: " + books[i].title);
            System.out.println("Author: " + books[i].author);
            System.out.println("Year: " + books[i].year);
            System.out.println("Price: " + books[i].price);
            System.out.println();
        }
    }
}
