import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookServiceIntegrationTest {

    @Test
    public void testAddBookIntegration() {

        BookRepository repo = new BookRepository();
        BookService service = new BookService(repo);

        Book book = new Book("1abcd", "First Book", 10 , 50.0, "Fiction");

        boolean result = service.addBook(book);

        assertTrue(result);
        assertEquals(1, repo.getBookCount());
    }
}