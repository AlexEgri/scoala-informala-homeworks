package ro.sci.bookstore;


public class Cart {
	private CartEntry cartEntry;
	private double totalPrice;

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Cart(CartEntry cartEntry) {
		this.cartEntry = cartEntry;
	}

	public CartEntry getCartEntry() {
		return cartEntry;
	}

	public void setCartEntry(CartEntry cartEntry) {
		this.cartEntry = cartEntry;
	}
}
