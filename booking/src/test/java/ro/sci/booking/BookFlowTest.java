package ro.sci.booking;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookFlowTest {
	List<Accommodation> rooms;

	List<BookingPeriod> periods;

	List<Booking> bookings;

	@Before
	public void init() {
		rooms = new ArrayList<Accommodation>();

		Date from = getDate(2016, 5, 1);
		Date to = getDate(2016, 8, 27);
		Season season = createSeason(SeasonType.HIGH, from, to);

		RoomFair roomFair1 = createRoomFair(100, season);
		RoomFair roomFair2 = createRoomFair(70, season);
		Accommodation room1 = createNewRoom(AccommodationType.ROYAL, roomFair1);
		rooms.add(room1);
		Accommodation room2 = createNewRoom(AccommodationType.SINGLE, roomFair2);
		rooms.add(room2);
		periods = new ArrayList<BookingPeriod>();

		periods.add(new BookingPeriod(getDate(2016, 5, 12), getDate(2016, 5, 17)));
		periods.add(new BookingPeriod(getDate(2016, 6, 10), getDate(2016, 6, 13)));
		periods.add(new BookingPeriod(getDate(2016, 7, 5), getDate(2016, 7, 12)));
		periods.add(new BookingPeriod(getDate(2016, 8, 2), getDate(2016, 8, 4)));

		bookings = new ArrayList<Booking>();

		bookings.add(new Booking(room1, periods.get(0)));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBookingsListSizeIsCorrect() {
		assertTrue(bookings.size() == 1);
	}

	@Test
	public void testBookingsListSizeIsStillCorrect() {
		assertFalse(bookings.size() == 2);
	}

	@Test
	public void testIfBookingIsMade() {
		bookings.add(new Booking(rooms.get(1), periods.get(2)));
		assertNotNull(bookings.get(1));
	}

	@Test
	public void testIfBookingIsNotMade() {
		bookings.add(new Booking(rooms.get(1), periods.get(3)));
		assertTrue(bookings.size() == 2);
	}

	@Test
	public void testBookingIsNotMadeIfSameRoomAndPeriodIsAdded() {
		Date from = getDate(2016, 5, 25);
		Date to = getDate(2016, 5, 30);
		addAccommodationTypeByPeriod(AccommodationType.SINGLE, from, to);
		assertEquals(2, bookings.size());
		addAccommodationTypeByPeriod(AccommodationType.ROYAL, from, to);
		addAccommodationTypeByPeriod(AccommodationType.ROYAL, from, to);
		assertTrue(bookings.size() == 3);
	}

	private void addAccommodationTypeByPeriod(AccommodationType type, Date from, Date to) {
		if (!findAccomodationTypeByPeriod(type, from, to)) {
			for (Accommodation room : rooms) {
				if (room.getType().equals(type)) {
					BookingPeriod bookingPeriod = new BookingPeriod(from, to);
					periods.add(bookingPeriod);
					Booking booking = new Booking(room, bookingPeriod);
					bookings.add(booking);
					return;
				}
			}
		}
	}

	private boolean findAccomodationTypeByPeriod(AccommodationType type, Date from, Date to) {
		boolean found = false;
		for (Booking booking : bookings) {
			if ((booking.getBookingPeriod().getFrom().after(from)) && (booking.getBookingPeriod().getTo().before(to))) {
				found = true;
			} else {
				if (booking.getRoom().getType().equals(type)) {
					if (((booking.getBookingPeriod().getFrom().before(from)
							|| booking.getBookingPeriod().getFrom().equals(from))
							&& (booking.getBookingPeriod().getTo().after(from)))
							|| ((booking.getBookingPeriod().getFrom().before(to)
									&& booking.getBookingPeriod().getTo().after(to)))) {
						found = true;
					}
				}

			}
			if (found) {
				break;
			}
		}
		return found;
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
