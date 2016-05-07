package ro.sci.booking;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ViewBookingTest {

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
		rooms = null;
		bookings = null;
		periods = null;
	}

	@Test
	public void testIfBookingHasCorrectBookingPeriod() {
		// System.out.println(bookings.get(1).getBookingPeriod().toString());
		assertEquals(periods.get(0), bookings.get(0).getBookingPeriod());
	}

	@Test
	public void testIfBookingHasCorrectRoom() {
		assertEquals(rooms.get(0), bookings.get(0).getRoom());
	}

	@Test
	public void testIfFirstBookingHasCorrectFromDate() {
		// preparing some dates and booking periods to compare them if they are
		// added correctly

		Date from = getDate(2016, 5, 12);
		Date to = getDate(2016, 5, 17);
		BookingPeriod testPeriod = new BookingPeriod(from, to);
		periods.add(testPeriod);
		addAccommodationTypeByPeriod(AccommodationType.DOUBLE, from, to);
		// because testing the dates themselves directly sometimes provides
		// inconsistent results, they are converted into strings before being
		// tested against each other
		assertEquals(from.toString(), bookings.get(0).getBookingPeriod().getFrom().toString());
	}

	@Test
	public void testIfFirstBookedRoomHasCorrectBedType() {
		BedType testBedType = BedType.KING_SIZE;
		assertTrue(testBedType == bookings.get(0).getRoom().getBedType());
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
