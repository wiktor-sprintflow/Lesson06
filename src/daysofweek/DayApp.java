package daysofweek;

public class DayApp {
    public static void main(String[] args) {
        int day = 8;
        Day day1 = new Day(day);
        System.out.println("Podany numer dnia tygodnia: " + day);
        System.out.println(day1.checkDay() + " to " + day1.isWorkingDay());
    }
}
