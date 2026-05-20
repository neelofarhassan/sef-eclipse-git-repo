import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BookServiceUnitTest {
	
	//Keeping Stub inside test class as it is only used for testing
    static class StubBookRepository extends BookRepository {

        @Override
        public boolean saveBook(Book book) {
            // Do not store anything, just pretend it worked
            return true;
        }
    }

    @Test
    public void testValidBook() {
        BookService service = new BookService(new StubBookRepository());

        Book book = new Book("1abcd", "First Book", 10 , 5.0, "kids");

        assertTrue(service.addBook(book));
    }

    @Test
    public void testInvalidId() {
        BookService service = new BookService(new StubBookRepository());

        Book book = new Book("1abc", "First Book", 10 , 15.4, "kids");

        assertFalse(service.addBook(book));
    }

    @Test
    public void testInvalidTitleTooShort() {
        BookService service = new BookService(new StubBookRepository());

        Book book = new Book("1abcd", "Book", 10 , 15.4, "kids");

        assertFalse(service.addBook(book));
    }

    @Test
    public void testInvalidTitleTooLong() {
        BookService service = new BookService(new StubBookRepository());

        Book book = new Book("1A234", "This is a very long title", 10, 15.0, "kids");

        assertFalse(service.addBook(book));
    }

    @Test
    public void testInvalidPrice() {
        BookService service = new BookService(new StubBookRepository());

        Book book = new Book("1abcd", "First Book", 10 , 4.6, "kids");

        assertFalse(service.addBook(book));
    }

    @Test
    public void testKidsBookPriceExceeded() {
        BookService service = new BookService(new StubBookRepository());

        Book book = new Book("1abcd", "First Book", 10 , 50.0, "kids");

        assertFalse(service.addBook(book));
    }
    
    
    

}

