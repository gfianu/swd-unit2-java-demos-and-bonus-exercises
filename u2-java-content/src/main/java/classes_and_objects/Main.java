package classes_and_objects;

public class Main {

    public static void main(String[] args) {
    // TODO: Instantiate a Library object called library
        Library library = new Library();

    // TODO: Instantiate 3 books
    Book book1 = new Book("Contact", "Carl Sagan", 430);
    Book book2 = new Book("Nemesis", "Isaac Asimov", 364);
    Book book3 = new Book("1984", "George Orwell", 300);

    // TODO: Add the books to the library collection and print it
    Book[] bookArr = {book1, book2, book3};
    library.addBooks(bookArr);
    library.printAvailableBooks();

    book1.checkOutBook();
    book2.checkOutBook();
    library.printAvailableBooks();

    book1.checkInBook();
    library.printAvailableBooks();
    }
}
