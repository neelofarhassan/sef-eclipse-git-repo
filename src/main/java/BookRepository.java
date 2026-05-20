		


		import java.util.ArrayList;
		import java.util.List;
		
		public class BookRepository {
		
		    private List<Book> database = new ArrayList<>();
		
		    public boolean saveBook(Book book) {
		        database.add(book);
		        return true;
		    }
		
		    public int getBookCount() {
		        return database.size();
		    }
		}
		
		
		
		