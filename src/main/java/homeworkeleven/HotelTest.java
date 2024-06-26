package homeworkeleven;

import java.util.Date;

public class HotelTest {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        try {
            Reservation reservation1 = new Reservation(101, new Date(2023, 5, 15), new Date(2023, 5, 20));
            hotel.bookRoom(reservation1);

            Reservation reservation2 = new Reservation(102, new Date(2023, 5, 15), new Date(2023, 5, 20));
            hotel.bookRoom(reservation2);

            Reservation reservation3 = new Reservation(102, new Date(2023, 5, 21), new Date(2023, 5, 26));
            hotel.bookRoom(reservation3);

            Reservation reservation4 = new Reservation(103, new Date(2023, 5, 14), new Date(2023, 5, 7));
//          hotel.bookRoom(reservation4); /** for InvalidDateException **/

            Reservation reservation5 = new Reservation(102, new Date(2023, 5, 21), new Date(2023, 5, 26));
//          hotel.bookRoom(reservation5); /** for RoomAlreadyBookedException **/

            hotel.cancelReservation(reservation1);

            Reservation reservation6 = new Reservation(112, new Date(2023, 5, 21), new Date(2023, 5, 26));
//          hotel.cancelReservation(reservation6); /** for ReservationNotFoundException **/

            hotel.isRoomAvailable(102, new Date(2023, 30, 14), new Date(2023, 6, 10));

//          hotel.isRoomAvailable(102, new Date(2023, 5, 14), new Date(2023, 6, 28)); /** for RoomAlreadyBookedException **/

        } catch (RoomAlreadyBookedException | ReservationNotFoundException | InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
}
