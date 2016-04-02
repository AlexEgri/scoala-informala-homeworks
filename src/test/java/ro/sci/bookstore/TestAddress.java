package ro.sci.bookstore;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAddress {
	// Declare a field for an address
	private Address address;

	@Before
	public void initAddress() {
		address = new Address();
		address.setAddressCity("Cluj Napoca");
		address.setAddressNumber("153");
		address.setAddressStreet("Maramuresului");
		System.out.println("new address object created! " + address.getAddressCity() + " " + address.getAddressNumber()
				+ " " + address.getAddressStreet());
	}

	@Test
	public void testAddressExists() {
		assertNotNull(address);
		assertEquals(address, address);
	}
	
	
	public void deleteAddressCity(){
		System.out.println("deleting parameters!");
		address.setAddressCity(null);
		
	}

	@Test
	public void testAddressCityDeleted(){
		deleteAddressCity();
		assertNull(address.getAddressCity());
	}
	
	@After
	public void destroyAddressObject(){
		address = null;
	}
}
