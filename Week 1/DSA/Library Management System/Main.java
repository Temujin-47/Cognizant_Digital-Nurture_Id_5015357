public class Main {
    public static void main(String[] args) {

        Book[] books = {
                new Book(1, "The Da Vinci Code", "Dan Brown"),
                new Book(2, "To Kill a Mockingbird", "Harper Lee"),
                new Book(3, "Angels and Demons", "Dan Brown"),
                new Book(4, "Deception Point", "Dan Brown"),
                new Book(5, "The Catcher in the Rye", "J.D. Salinger")
        };

        System.out.println("Linear Search:");
        Book foundBook = LinearSearch.linearSearch(books, "Deception Point");
        System.out.println(foundBook != null ? foundBook : "Book not found.");

        System.out.println("\nBinary Search:");
        foundBook = BinarySearch.binarySearch(books, "The Da Vinci Code");
        System.out.println(foundBook != null ? foundBook : "Book not found.");
    }
}
