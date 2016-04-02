package ro.sci.bookstore;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestStock {
	Book book1;
	Stock stock1;

	@Before
	public void setUp() throws Exception {
		book1 = new Book(666);
		stock1 = new Stock(book1, 6);
	}

	@Test
	public void test() {
		assertNotNull(stock1);
		assertEquals(stock1.getStockQuantity(), 6);

	}

	@After
	public void tearDown() throws Exception {
		book1 = null;
		stock1 = null;
	}

}
