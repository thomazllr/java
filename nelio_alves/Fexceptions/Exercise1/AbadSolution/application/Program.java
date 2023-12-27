package nelio_alves.Fexceptions.Exercise1.AbadSolution.application;

import nelio_alves.Fexceptions.Exercise1.AbadSolution.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the room number: ");
        int room = sc.nextInt();
        System.out.println("Check-in date (dd/MM/yyyy): ");
        Date checkIn = fmt.parse(sc.next());
        System.out.println("Check-out date (dd/MM/yyyy): ");
        Date checkOut = fmt.parse(sc.next());


        if(!checkOut.after(checkIn)) {
            System.out.println("Impossible to do that!");
        }
        else{
            Reservation reservation = new Reservation(room, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkIn = fmt.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkOut = fmt.parse(sc.next());

            Date now = new Date();

            if(checkIn.before(now) || checkOut.before(now)) {
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            }
            else {
                if(!checkOut.after(checkIn)) {
                    System.out.println("Impossible to do that!");
                }
                else {
                    reservation.updateDates(checkIn, checkOut);
                    System.out.println("Reservation: " + reservation);


                }
            }


        }



    }
}
