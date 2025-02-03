package BehavioralPatterns.IteratorPattern.GoodCode;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("C++ Book"));
        bookCollection.addBook(new Book("Python Book"));
        bookCollection.addBook(new Book("Java Book"));

        Iterator<Book> iterator = bookCollection.getIterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}
