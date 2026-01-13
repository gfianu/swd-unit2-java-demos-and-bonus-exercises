package object_oriented_programming.library;

public class Book {

    // TODO: Create static nextIdNum for creating unique bookIds
    private static int nextIdNum = 1;

    // FIELDS

    // TODO: Declare a final String bookId
    private final String bookId;
    private String title;
    private String author;
    private int numPages;
    private boolean available = true;
    // TODO: Declare an int timesCheckedOut (initialized to 0)
    private int timesCheckedOut = 0;

    // CONSTRUCTORS

    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        // TODO: Set the value of bookId using an instance method
        this.bookId = generateBookId();
    }

    // TODO: Create an overloaded constructor that allows numPages to be optional

    public Book(String title, String author) {
        this(title, author, 0);
    }


    // GETTERS & SETTERS
    public static int getNextIdNum() {
        return nextIdNum;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public boolean isAvailable() {
        return available;
    }

    // TODO: remove setter for available
//    public void setAvailable(boolean available) {
//        this.available = available;
//    }


    // TODO: Add getter and setter for timesCheckedOut

    public int getTimesCheckedOut() {
        return timesCheckedOut;
    }

    public void setTimesCheckedOut(int timesCheckedOut) {
        this.timesCheckedOut = timesCheckedOut;
    }


    // OVERRIDE SPECIAL METHODS

    // TODO: Override toString() and produce a custom formatted block of information about a book

    @Override
    public String toString() {
        String availability = isAvailable() ? "Available for checkout" : "CURRENTLY UNAVAILABLE";
        String timePlural = timesCheckedOut == 1 ? "" : "s";
        String newline = System.lineSeparator();
        return newline + getTitleAndAuthor() + newline +
                numPages + " pages" +
                newline + "Book " + bookId + " checked out " +
                timesCheckedOut + " time" + timePlural +
                newline + availability;


    }


    // INSTANCE METHODS

    // TODO: Create an instance method that uses the current value of nextIdNum to generate an id
    private String generateBookId() {
        String id = Utils.getInitials(author) + "-" + title.substring(0,3).toUpperCase() + "-" + nextIdNum;
        nextIdNum++;
        return id;
    }

    // TODO: Create an instance method that returns a phrase like "Contact by Carl Sagan"
    public String getTitleAndAuthor() {
        return title + " by " + author;
    }

    // TODO: Create an instance method to check a book out and log a sentence about it
    public void checkOut() {
        if (available) {
            available = false;
            timesCheckedOut++;
            System.out.println(System.lineSeparator() + getTitleAndAuthor() + " has been checked out.");
        }
    }

    // TODO: Create an instance method to check a book in and log a sentence about it
    public void checkIn() {
        if (!available) {
            available = true;
            System.out.println(System.lineSeparator() + getTitleAndAuthor() + " has been returned to the library.");
        }
    }
}
