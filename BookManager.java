import java.util.ArrayList;
import java.util.List;

public class BookManager implements BookOperations {
    private List<Book> books;

    public BookManager() {
        this.books = new ArrayList<>();
        books.add(new Book("wiedzmin", "sapkowski", "ISBN1", 2000));
        books.add(new Book("harryPotter", "jkrowling", "ISBN2", 1999));
        books.add(new Book("hobbit", "tolkien", "ISBN3", 1980));
        books.add(new Book("lotr", "tolkien", "ISBN4", 1998));
        books.add(new Book("starwars", "lucas", "ISBN5", 2005));
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    @Override
    public void updateBook(String isbn, Book updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) {
                books.set(i, updatedBook);
                break;
            }
        }
    }

    @Override
    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }
}