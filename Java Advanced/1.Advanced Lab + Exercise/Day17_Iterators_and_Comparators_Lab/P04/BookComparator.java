package Day17_Iterators_and_Comparators_Lab.P04;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        int result = firstBook.getTitle().compareTo(secondBook.getTitle());
        if (result == 0) {
            return Integer.compare(firstBook.getYear(), secondBook.getYear());
        }
        return result;
    }
}