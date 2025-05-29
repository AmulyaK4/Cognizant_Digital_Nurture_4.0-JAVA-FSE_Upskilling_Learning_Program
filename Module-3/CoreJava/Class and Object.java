class Book {
    String title;
    String author;

    void display() {
        System.out.println(title + " by " + author);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Harry Potter";
        book.author = "J.K. Rowling";
        book.display();
    }
}

