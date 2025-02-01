package BehavioralPatterns.IteratorPattern.BadCode;

public class Client {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("C++ Book"));
        bookCollection.addBook(new Book("Python Book"));
        bookCollection.addBook(new Book("Java Book"));

        for (int i = 0; i < bookCollection.getBooks().size(); i++) {
            System.out.println(bookCollection.getBooks().get(i));
        }
    }
}
