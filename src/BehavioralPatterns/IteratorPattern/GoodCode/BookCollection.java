package BehavioralPatterns.IteratorPattern.GoodCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public Iterator<Book> getIterator() {
        return new BookIterator(books);
    }

    // Nested Class
    private class BookIterator implements Iterator<Book>{
        private List<Book> books;
        private int position = 0;

        BookIterator(List<Book> books) {
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return (position < books.size());
        }

        @Override
        public Book next() {
            return books.get(position++);
        }
    }
}
