package BehavioralPatterns.IteratorPattern.InternalImplementation;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BookCollection implements Iterable<Book> {
    private Set<Book> books = new TreeSet<>();

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }
}
