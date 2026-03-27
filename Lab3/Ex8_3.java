class Author {
    String name;
    String nationality;
    int age;
    String gender;
    int booksWritten;

    Author(String name, String nationality, int age, String gender, int booksWritten) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.gender = gender;
        this.booksWritten = booksWritten;
    }
}

class Book {
    String title;
    double price;
    int pages;
    String genre;
    String isbn;
    Author author;

    Book(String title, double price, int pages, String genre, String isbn, Author author) {
        this.title = title;
        this.price = price;
        this.pages = pages;
        this.genre = genre;
        this.isbn = isbn;
        this.author = author;
    }

    void display() {
        System.out.println(title + " | $" + price +
                " | Pages: " + pages +
                " | Genre: " + genre +
                " | Author: " + author.name);
    }
}

public class Ex8_3 {
    public static void main(String[] args) {
        Author a1 = new Author("John Doe", "USA", 45, "M", 10);
        Author a2 = new Author("Jane Smith", "UK", 38, "F", 7);

        Book b1 = new Book("Java Basics", 29.99, 300, "Education", "ISBN001", a1);
        Book b2 = new Book("Advanced Java", 39.99, 450, "Education", "ISBN002", a1);
        Book b3 = new Book("Life Story", 19.99, 200, "Biography", "ISBN003", a2);

        Book[] books = {b1, b2, b3};

        for (Book b : books) {
            b.display();
        }
    }
}