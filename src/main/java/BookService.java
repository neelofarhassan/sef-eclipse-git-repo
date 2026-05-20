


		
		public class BookService {
		
		    private BookRepository repository;
		
		    public BookService(BookRepository repository) {
		        this.repository = repository;
		    }
		
		    public boolean addBook(Book book) {
		
		        // ID validation
		        String id = book.getId();
		        if (id == null || id.length() != 5 || !Character.isDigit(id.charAt(0))) {
		            return false;
		        }
		
		        // Title validation
		        String title = book.getTitle();
		        if (title == null) return false;
		
		        String[] words = title.trim().split("\\s+");
		        if (words.length < 2 || words.length > 4) {
		            return false;
		        }
		
		        // Price validation
		        double price = book.getPrice();
		        if (price <= 5 || price >= 250) {
		            return false;
		        }
		
		        // Kids book constraint
		        if (book.getType().equalsIgnoreCase("Kids") && price > 40) {
		            return false;
		        }
		
		        return repository.saveBook(book);
		    }
		}
		
		
		
		
		