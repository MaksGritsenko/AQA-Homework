import homeworkeleven.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Date;

public class HotelTest {

    private Hotel hotel;
    private Reservation reservation1;
    private Reservation reservation2;

    @BeforeClass
    public void setUpClass() {
        hotel = new Hotel();
        reservation1 = new Reservation(101, new Date(2022, 5, 15), new Date(2022, 5, 20));
        reservation2 = new Reservation(999, new Date(2022, 5, 15), new Date(2022, 5, 20));
    }

    @Test(priority = 1)
    public void testBookRoomSuccessfully() throws RoomAlreadyBookedException, InvalidDateException {
        hotel.bookRoom(reservation1);
        Assert.assertTrue(hotel.getReservations().contains(reservation1), "Reservation should be booked");
    }

    @Test(priority = 2)
    public void checkRoomIsNotBooked() {
        Reservation reservation3 = new Reservation(101, new Date(2022, 5, 15), new Date(2022, 5, 20));
        Assert.assertFalse(hotel.getReservations().contains(reservation3), "Reservation should not be booked");
    }

    @Test(priority = 3, expectedExceptions = RoomAlreadyBookedException.class)
    public void checkBookRoomIsAlreadyBooked() throws RoomAlreadyBookedException, InvalidDateException {
        Reservation reservation4 = new Reservation(333, new Date(2022, 5, 15), new Date(2022, 5, 20));
        hotel.bookRoom(reservation4);
        hotel.bookRoom(reservation4);
    }

    @Test(priority = 4, expectedExceptions = InvalidDateException.class)
    public void checkBookRoomInvalidDate() throws RoomAlreadyBookedException, InvalidDateException {
        Reservation reservation5 = new Reservation(333, new Date(2022, 5, 15), new Date(2022, 5, 1));
        hotel.bookRoom(reservation5);
    }

    @Test(priority = 5, expectedExceptions = ReservationNotFoundException.class)
    public void checkCancelReservationNotFound() throws ReservationNotFoundException {
        hotel.cancelReservation(reservation2);
    }

    @Test(priority = 6)
    public void checkCancelReservationSuccessfully() throws RoomAlreadyBookedException, InvalidDateException, ReservationNotFoundException {
        Reservation reservation7 = new Reservation(777, new Date(2022, 5, 15), new Date(2022, 5, 20));
        hotel.bookRoom(reservation7);
        Assert.assertTrue(hotel.getReservations().contains(reservation7), "Reservation should be booked");
        hotel.cancelReservation(reservation7);
        Assert.assertFalse(hotel.getReservations().contains(reservation7), "Reservation should not be booked");
    }

    @Test(priority = 7)
    public void checkIsRoomAvailable() throws RoomAlreadyBookedException, InvalidDateException {
        Assert.assertTrue(hotel.isRoomAvailable(666,
                        new Date(2023, 6, 14),
                        new Date(2023, 6, 28)),
                "Room should be available");
    }

    @Test(priority = 8, expectedExceptions = InvalidDateException.class)
    public void checkIsRoomAvailableInvalidDate() throws RoomAlreadyBookedException, InvalidDateException {
        hotel.isRoomAvailable(1818, new Date(2023, 6, 28), new Date(2023, 6, 14));
    }

    @AfterClass
    public void tearDownClass() {
        hotel.getReservations().clear();
    }
}
