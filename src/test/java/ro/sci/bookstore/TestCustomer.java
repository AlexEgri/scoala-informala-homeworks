package ro.sci.bookstore;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCustomer {

	private Customer customer1;
	private Address address1;
	private Cart customer1Cart1;
	private CartEntry cartEntry1;
	private Book book1;

	@Before
	public void initCustomer() throws Exception {
		customer1 = new Customer("Cucu Stefan", "alandala@gmail.com", customer1Cart1, address1);
		address1 = new Address("ciocarliei", "125", "cluj-napoca");
		customer1Cart1 = new Cart(cartEntry1);
		cartEntry1 = new CartEntry(book1, 5);
		book1 = new Book(45357, "Dune", "sci fi", "frank herbert", 250, 16.5);
	}

	@After
	public void tearDown() throws Exception {
		customer1 = null;
		customer1Cart1 = null;
		address1 = null;
		cartEntry1 = null;
		book1 = null;
	}

	@Test
	public void test() {
		assertNotNull(customer1);
		
	}

}
