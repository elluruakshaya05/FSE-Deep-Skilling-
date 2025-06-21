
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(100);
        Scanner scanner = new Scanner(System.in);

        // Sample books
        library.addBook(new Book(1, "Java Basics", "Alice"));
        library.addBook(new Book(2, "Python Essentials", "Bob"));
        library.addBook(new Book(3, "Data Structures", "Charlie"));
        library.addBook(new Book(4, "Algorithms", "Diana"));

        while (true) {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Display Books");
            System.out.println("2. Linear Search by Title");
            System.out.println("3. Binary Search by Title");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;

                case 2:
                    System.out.print("Enter book title to search (linear): ");
                    String linearTitle = scanner.nextLine();
                    Book foundLinear = library.linearSearchByTitle(linearTitle);
                    System.out.println(foundLinear != null ? foundLinear : "Book not found.");
                    break;

                case 3:
                    System.out.print("Enter book title to search (binary): ");
                    String binaryTitle = scanner.nextLine();
                    Book foundBinary = library.binarySearchByTitle(binaryTitle);
                    System.out.println(foundBinary != null ? foundBinary : "Book not found.");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

