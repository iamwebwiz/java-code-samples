
public class BookingTester
{
    public static void main(String[] args)
    {
        // Instantiate an object of TimeTable class
        TimeTable uniTimeTable = new TimeTable(3, 5);

        // Make new booking items
        Booking booking1 = new Booking("Room 1", "Webwiz");
        Booking booking2 = new Booking("Room 2", "I_Code");

        // Make the booking
        uniTimeTable.makeBooking(1, 5, booking1);
        uniTimeTable.makeBooking(2, 4, booking2);

        // Test for cancelBooking method
        uniTimeTable.cancelBooking(2, 3);

        // Check if a booking space is free
        uniTimeTable.isFree(2, 2);

        // Get a booking record
        uniTimeTable.getBooking(1, 3);
        uniTimeTable.getBooking(2, 2);
    }
}
