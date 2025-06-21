import java.util.Arrays;
import java.util.Comparator;

public class Library {
    private Book[] books;
    private int count;

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count >= books.length) {
            System.out.println("Library is full.");
        } else {
            books[count++] = book;
            System.out.println("Book added.");
        }
    }

    // Linear Search by title
    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    // Binary Search by title
    public Book binarySearchByTitle(String title) {
        // Sort first by title (case-insensitive)
        Book[] sortedBooks = Arrays.copyOf(books, count);
        Arrays.sort(sortedBooks, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));

        int left = 0;
        int right = sortedBooks.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            String midTitle = sortedBooks[mid].getTitle();

            int cmp = title.compareToIgnoreCase(midTitle);
            if (cmp == 0) {
                return sortedBooks[mid];
            } else if (cmp < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return null;
    }

    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books available.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(books[i]);
            }
        }
    }
}
