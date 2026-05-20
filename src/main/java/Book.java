


		public class Book {
		    private String id;
		    private String title;
		    private int quantity;
		    private double price;
		    private String type;
		
		    public Book(String id, String title, int quantity, double price, String type) {
		        this.id = id;
		        this.title = title;
		        this.quantity = quantity;
		        this.price = price;
		        this.type = type;
		    }
		
		    public String getId() { return id; }
		    public String getTitle() { return title; }
		    public double getPrice() { return price; }
		    public String getType() { return type; }
		    public int getQuantity() {return quantity;}
		}
		
		
		
		