public class Book {
    private String bookName;
    private int pages;
    private int publicationYear;

    public Book (String bookName, int pages, int publicationYear) {
        this.bookName = bookName;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    @Override
    public String toString() {
        return this.bookName + ", " +this.pages + " pages, " + this.publicationYear;
    }
}
