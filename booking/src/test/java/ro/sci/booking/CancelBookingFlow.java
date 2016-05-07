package ro.sci.booking;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CancelBookingFlow {
	List<Accommodation> rooms;

	List<BookingPeriod> periods;

	List<Booking> bookings;

	@Before
	public void setUp() throws Exception {

		rooms = new ArrayList<Accommodation>();

		Date from = getDate(2016, 5, 1);
		Date to = getDate(2016, 8, 27);
		Season season = createSeason(SeasonType.HIGH, from, to);

		RoomFair roomFair1 = createRoomFair(100, season);
		Accommodation room1 = createNewRoom(AccommodationType.ROYAL, roomFair1);
		rooms.add(room1);

		periods = new ArrayList<BookingPeriod>();

		periods.add(new BookingPeriod(getDate(2016, 5, 12), getDate(2016, 5, 17)));
		periods.add(new BookingPeriod(getDate(2016, 6, 10), getDate(2016, 6, 13)));
		periods.add(new BookingPeriod(getDate(2016, 7, 5), getDate(2016, 7, 12)));
		periods.add(new BookingPeriod(getDate(2016, 8, 2), getDate(2016, 8, 4)));

		bookings = new ArrayList<Booking>();

		bookings.add(new Booking(room1, periods.get(0)));
		bookings.add(new Booking(room1, periods.get(1)));
		bookings.add(new Booking(room1, periods.get(2)));
		bookings.add(new Booking(room1, periods.get(3)));

		bookings.get(0).getRoom().setBedType(BedType.KING_SIZE);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIfBookingsArrayIsIncreasedWhenNewBookingIsCreated() {

		Date from = getDate(2017, 5, 1);
		Date to = getDate(2017, 5, 10);
		BookingPeriod testPeriod = new BookingPeriod(from, to);
		periods.add(testPeriod);
		Accommodation roomBest = new Accommodation();
		roomBest.setBedType(BedType.SINGLE);
		roomBest.setMaxGuests(2);
		Season season = createSeason(SeasonType.MID, from, to);
		RoomFair fair = createRoomFair(66, season);
		roomBest.setFair(fair);
		rooms.add(roomBest);
		Booking testBooking = new Booking(roomBest, testPeriod);
		bookings.add(testBooking);

		// check if bookings list is increased
		assertTrue(bookings.size() == 5);

	}

	@Test // test if booking array is decreased when removing a booking from it
			// and its corresponding booking period is also removed
	public void testBookingRemoved() {
		removeBooking(bookings.get(0));
		assertEquals(3, bookings.size());
		assertTrue(periods.size() == 3);
	}

	private void removeBooking(Booking booking) {
		periods.remove(bookings.get(0).getBookingPeriod()); // remove booked
															// period
		bookings.remove(booking); // remove actual booking from the list
	}

	private Date getDate(int year, int month, int day) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month);
		c.set(Calendar.DAY_OF_MONTH, day);

		return c.getTime();
	}

	private Season createSeason(SeasonType type, Date from, Date to) {
		Season season = new Season();
		season.setFrom(from);
		season.setTo(to);
		season.setType(type);
		return season;
	}

	private Accommodation createNewRoom(AccommodationType type, RoomFair fair) {
		Accommodation accomodation = new Accommodation();
		accomodation.setType(type);
		accomodation.setFair(fair);
		return accomodation;
	}

	private RoomFair createRoomFair(int i, Season season) {
		RoomFair roomFair = new RoomFair();
		roomFair.setSeason(season);
		roomFair.setValue(i);
		return roomFair;

	}
}
