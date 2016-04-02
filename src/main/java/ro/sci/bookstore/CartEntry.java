package ro.sci.bookstore;

public class CartEntry {
	private Book book;
	private int orderedQuantity;

	public CartEntry(Book book, int orderedQuantity) {
		this.book = book;
		this.orderedQuantity = orderedQuantity;
	}
	
	public double computeCartEntryPrice(Book book, int orderedQuantity){
		return book.getPrice() * orderedQuantity;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getOrderedQuantity() {
		return orderedQuantity;
	}

	public void setOrderedQuantity(int orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}

}
