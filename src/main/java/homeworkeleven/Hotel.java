package homeworkeleven;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hotel {

    private List<Reservation> reservations;

    public Hotel() {
        reservations = new ArrayList<>();
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public boolean isRoomAvailable(int roomNumber, Date startDate, Date endDate) throws RoomAlreadyBookedException, InvalidDateException {
        if (endDate.before(startDate)) {
            throw new InvalidDateException("INVALID DATA" + "\n" + "End day: " + endDate
                    + " can't be earlier than Start day:" + startDate);
        } else {
            for (Reservation reservation : reservations) {
                if (reservation.getRoomNumber() == roomNumber && (reservation.getStartDate().after(startDate) || reservation.getStartDate().equals(endDate))) {
                    throw new RoomAlreadyBookedException("Room:" + roomNumber + " is already booked on this date");
                }
                return true;
            }
            return false;
        }
    }

    public void bookRoom(Reservation newReservation) throws RoomAlreadyBookedException, InvalidDateException {
        for (Reservation reservation : reservations) {
            if (reservation.getEndDate().after(newReservation.getStartDate())
                    && reservation.getRoomNumber() == newReservation.getRoomNumber()) {
                throw new RoomAlreadyBookedException(newReservation.toString()
                        + " is already booked on this day");
            } else if (newReservation.getEndDate().before(reservation.getStartDate())) {
                throw new InvalidDateException("INVALID DATA" + "\n" + "End day: " + newReservation.getEndDate()
                        + " can't be earlier than Start day:" + newReservation.getStartDate());
            }
        }
        reservations.add(newReservation);
    }

    public void cancelReservation(Reservation reservation) throws ReservationNotFoundException {
        if (!reservations.contains(reservation)) {
            throw new ReservationNotFoundException(reservation.toString() + " not found");
        } else {
            reservations.remove(reservation);
        }
    }
}
