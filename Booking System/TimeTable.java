import java.util.*;

class TimeTable
{
    private Booking[][] times;

    public TimeTable(int days, int periods)
    {
        this.times = new Booking[days][periods];
    }

    public boolean makeBooking(int day, int period, Booking booking)
    {
        if (times[day][period] == null) {
            times[day][period] = booking;
            System.out.println("Booking Record Added Successfully!");
            return true;
        }
        else {
            System.out.println("Booking Record Not Successful!");
            return false;
        }
    }

    public boolean isFree(int day, int period)
    {
        if (times[day][period] == null) {
            System.out.println("This slot is free");
            return true;
        }
        else {
            System.out.println("This slot is taken!");
            return false;
        }
    }

    public Booking getBooking(int day, int period)
    {
        if (times[day][period] != null) {
            System.out.println("=====> Booking Details <=====");
            System.out.println("Lecturer Name: " + times[day][period].getName());
            System.out.println("Room Number: " + times[day][period].getRoom());
            System.out.println("Number of Days: " + day);
            System.out.println("Number of Periods: " + period);
            return times[day][period];
        }
        else {
            System.out.println("Booking not Successful!");
            return times[day][period];
        }
    }

    public boolean cancelBooking(int day, int period)
    {
        if (times[day][period] != null) {
            times[day][period] = null;
            System.out.println("Booking Canceled!");
            return true;
        }
        else {
            System.out.println("Unable to cancel booking!");
            return false;
        }
    }

    public int numberOfDays()
    {
        return this.times[days];
    }

    public int numberOfPeriods()
    {
        return this.times[days][periods]
    }
}
