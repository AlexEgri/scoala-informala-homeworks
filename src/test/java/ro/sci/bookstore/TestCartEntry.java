package ro.sci.bookstore;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCartEntry {
	Book book1 = new Book(345);
	Book book2;
	Book book3;
	CartEntry cartEntry1, cartEntry2, cartEntry3;

	Stock stock1, stock2, stock3;

	@Before
	public void initCartEntry() throws Exception {
		book2 = new Book(365);
		book3 = new Book(888, "Gone with the wind", "romance", "unknown", 200, 350);
		cartEntry1 = new CartEntry(book1, 3);
		cartEntry2 = new CartEntry(book2, 1);
		cartEntry3 = new CartEntry(book3, 4);
		stock1 = new Stock(book1, 6);
		stock2 = new Stock(book2, 6);
		stock3 = new Stock(book3, 99);
		cartEntry3.computeCartEntryPrice(book3, 4);
		System.out.println(cartEntry3.computeCartEntryPrice(book3, 4));
	}

	@After
	public void tearDown() throws Exception {
		book1 = null;
		book2 = null;
		book3 = null;
		cartEntry1 = null;
		cartEntry2 = null;
		cartEntry3 = null;
		stock1 = null;
		stock2 = null;
		stock3 = null;
	}

	@Test
	public void test() {
		assertNotEquals(book1, book2);
		assertFalse(cartEntry1 == cartEntry2);
		assertEquals(stock1.getStockQuantity(), stock2.getStockQuantity());
		stock1.adjustStock(cartEntry1.getOrderedQuantity());
		cartEntry1.computeCartEntryPrice(book1, 3);
		System.out.println(stock1.getStockQuantity());
		assertNotEquals(stock1.getStockQuantity(), stock2.getStockQuantity());
	}
	
}
