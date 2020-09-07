import java.util.Scanner;
import java.lang.String;

class Book {

    // instance varaiables
    private String bookName;
    private String isbnNumber;
    private String authorName;
    private String publisher;

    // Default Constructor
    public Book () { }

    // Constructor using this keyword
    public Book (String bookNme, String isbnNo, String authorNme, String pub) {
        this.bookName = bookNme;
        this.isbnNumber = isbnNo;
        this.authorName = authorNme;
        this.publisher = pub;
    }

    // mutator or setter methods
    public void setBookName (String bookNme) {
        this.bookName = bookNme;
    }

    public void setISBNNumber (String isbnNo) {
        this.isbnNumber = isbnNo;
    }

    public void setAuthorname (String authorNme) {
        this.bookName = authorNme;
    }

    public void setPublisher (String pub) {
        this.bookName = pub;
    }

    // Accessor methods or Getters
    public String getBookName () {
        return this.bookName;
    }

    public String getISBNNumber () {
        return this.bookName;
    }

    public String getAuthorname () {
        return this.bookName;
    }

    public String getPublisher () {
        return this.bookName;
    }

    public String getBookInfo () {
        String bookInfo = "-------Book Information---------\n";
        bookInfo += "Book Name : " + this.bookName + "\n";
        bookInfo += "Book ISBN Number : " + this.isbnNumber + "\n";
        bookInfo += "Book Author Name : " + this.authorName + "\n";
        bookInfo += "Book Publisher : " + this.publisher + "\n";
        return bookInfo;
    }

}

public class BooksApp {
    // Book test Application
    public static void main(String[] args) {
        // Input
        Scanner in = new Scanner(System.in);

        Book[] books = new Book[30];
        int booksCount = -1;
        while ( true ) {
            // Menu
            System.out.println("Choose a option: ");
            System.out.println("1. Add Book");
            System.out.println("2. Get Book Details");
            System.out.println("3. Quit");
            // User choice
            int choice = in.nextInt();

            switch(choice) {
                // Case 1 : Adding a Book
                case 1:
                    booksCount++;
                    books[booksCount] = new Book();
                    System.out.println("Enter book name, isbn number, author name, publisher");
                    books[booksCount] = new Book(in.next(),in.next(),in.next(),in.next());              
                    break;

                // Case 2: Getting Book Details
                case 2:
                    System.out.print("Enter book name to get details: ");
                    String bnme = in.next();
                    for (int i = 0; i <= booksCount; ++i) {
                        if (books[i].getBookName().equals(bnme)) {
                            System.out.println(books[i].getBookInfo());
                        }
                    }
                    break;
                // case 3 Quit
                case 3:
                    return;

                // If no option is choosed, prompt again!
                default:
                    System.out.print("Error!Enter valid option :(");
            }
        }
    }
}
