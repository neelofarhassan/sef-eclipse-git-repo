	



		import org.junit.jupiter.api.Test;
		import static org.junit.jupiter.api.Assertions.*;
		import static org.mockito.Mockito.*;
		
		public class BookServiceMockTest {
		
		    @Test
		    public void testAddBook_Valid() {
		
		        // Step 1: Create mock
		        BookRepository mockRepo = mock(BookRepository.class);
		
		        // Step 2: Define behavior
		        when(mockRepo.saveBook(any(Book.class))).thenReturn(true);
		
		        // Step 3: Inject mock
		        BookService service = new BookService(mockRepo);
		
		        Book book = new Book("1A234", "Clean Code Book", 10 , 30.0, "Fiction");
		
		        // Step 4: Call method
		        boolean result = service.addBook(book);
		
		        // Step 5: Assert result
		        assertTrue(result);
		
		        // Step 6: Verify interaction
		        verify(mockRepo, times(1)).saveBook(book);
		    }
		}
		
		
		