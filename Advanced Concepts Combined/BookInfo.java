class Book {
    String title;
    String author;
    double price;

    Book(String title) {
        this.title = title;
        this.author = "Not Available";
        this.price = 0.0;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookInfo {
    public static void main(String[] args) {

        Book b1 = new Book("Java Basics");
        Book b2 = new Book("OOP Concepts", "James Gosling");
        Book b3 = new Book("Data Structures", "Mark Allen Weiss", 499.99);

        b1.display();
        b2.display();
        b3.display();
    }
}