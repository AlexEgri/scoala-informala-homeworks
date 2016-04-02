package ro.sci.bookstore;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCart {

	List<CartEntry> cart = null;
	private Book book1;
	private Stock stock1;
	private CartEntry newcartEntry;

	@Before
	public void setUp() throws Exception {
		cart = new ArrayList<CartEntry>();
		cart.add(newcartEntry);
		book1 = new Book(453567, "Dune vol.1", "Sci-Fi", "Frank Herbert", 350, 15);
		stock1 = new Stock(book1, 99);
		newcartEntry = new CartEntry(book1, 7);
		stock1.adjustStock(newcartEntry.getOrderedQuantity());

	}

	@After
	public void destroyCart() throws Exception {
		book1 = null;
		stock1 = null;
		newcartEntry = null;
	}

	@Test
	public void testCartNotEmpty() {
		assertNotNull(cart);

	}

	@Test
	public void testCartEntryAdjusted() {
		assertNotEquals(stock1.getStockQuantity(), 99);

	}

	@Test
	public void testCartLength() {
		assertTrue(cart.size() > 0);
	}

}
