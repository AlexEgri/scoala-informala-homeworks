package ro.sci.booking;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccomodationTest {
//	Accommodation accommodationsList = new Accommodation();
	List<Accommodation> accommodationsList = new ArrayList<Accommodation>();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		accommodationsList = null;
		
		
	}

	@Test
	public void testAccommodationsExistInAListWhenCreatedAndAdded() {
		Accommodation room1 = new Accommodation();
		room1.setType(AccommodationType.SINGLE);
		room1.setBedType(BedType.KING_SIZE);
		room1.setFair(null);
		room1.setMaxGuests(2);
		room1.setDescription("simple room");
		
		accommodationsList.add(room1);
		
		Accommodation room2 = new Accommodation();
		room2.setType(AccommodationType.PENTHOUSE);
		room2.setBedType(BedType.KING_SIZE);
		room2.setFair(null);
		room2.setMaxGuests(7);
		room2.setDescription("ellegant room");
		
		accommodationsList.add(room2);
		
		assertTrue(room1.getFair()==null);
		assertEquals(room2.getDescription(), "ellegant room");
		assertEquals(2, accommodationsList.size());
		
	}

}
