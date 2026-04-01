import java.util.Scanner;

public class Ex3 {  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count =0;
        Book[] books = new Book[99];
        while(true){
            System.out.println("==== Menu ===\r\n" + //
                                "1. View all books\r\n" + //
                                "2. Add a new book\r\n" + //
                                "3. Update a book\r\n" + //
                                "4. Quit\r\n" + //
                                "");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            switch (choice) {
                case 2:
                    System.out.println("===== Add a book =====");
                    System.out.print("Input ISBN: ");
                    int isbn = input.nextInt();
                    input.nextLine();
                    System.out.print("Input book's title: ");
                    String title = input.nextLine();
                    System.out.print("Input book's price: ");
                    double price = input.nextDouble();
                    input.nextLine();
                    
                    books[count] = new Book(isbn, title, price);
                    count++;
                    break;
                    case 1: 
                    System.out.println("======= View all books ======");
                    for(int j = 0 ; j < count; j++){
                        System.out.println("ISBN: "+ books[j].isbn+", Title: "+books[j].title+ ", Price: "+books[j].price);
                    }
                    break;
                    case 3: 
                    System.out.println("====== Update a book: ======");
                    System.out.print("Input ISBN: ");
                    int isbnCheck = input.nextInt();
                    input.nextLine();
                    for(int k = 0; k<count; k++){
                        if(isbnCheck == books[k].isbn){
                            System.out.println("Please update the following: ");
                            System.out.print("ISBN: ");
                            int isbnNew = input.nextInt();
                            input.nextLine();
                            System.out.print("Title: ");
                            String titleNew = input.nextLine();
                            System.out.print("Price: ");
                            double priceNew = input.nextDouble();
                            input.nextLine();
                            
                            books[k].isbn = isbnNew;
                            books[k].title = titleNew;
                            books[k].price = priceNew;
                        }else{
                        System.out.println("Book is not found. Try again");
                    }
                    }
                    
                    break;
                case 4: 
                System.exit(0);
            
                default:
                    System.out.println("Invalid input");
                    break;
            }


        }
    }   
}
class Book{
    int isbn;
    String title;
    double price;
    Book(int isbn, String title, double price){
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }
}
