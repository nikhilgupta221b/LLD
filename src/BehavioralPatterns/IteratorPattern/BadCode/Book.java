package BehavioralPatterns.IteratorPattern.BadCode;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
