package nelio_alves.Fexceptions.Exercise1.AbadSolution.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {
         long diff = checkOut.getTime() - checkIn.getTime();
         return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date newCheckIn, Date newCheckOut) {
        this.checkIn = newCheckIn;
        this.checkOut = newCheckOut;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Room: ");
        sb.append(roomNumber);
        sb.append(", check in: ");
        sb.append(fmt.format(checkIn));
        sb.append(", check out: ");
        sb.append(fmt.format(checkOut));
        sb.append(", ");
        sb.append(duration());
        sb.append(" nights.");
        return sb.toString();
    }
}
