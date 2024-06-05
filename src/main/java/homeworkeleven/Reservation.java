package homeworkeleven;

import java.util.Date;

public class Reservation {

    private int roomNumber;
    private Date startDate;
    private Date endDate;

    public Reservation(int roomNumber, Date startDate, Date endDate) {
        this.roomNumber = roomNumber;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "roomNumber=" + roomNumber +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
