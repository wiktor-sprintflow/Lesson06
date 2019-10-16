package daysofweek;

public class Day {
    int dayNumber;

    public Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    String checkDay() {
        String day = "";
        switch (dayNumber) {
            case 5:
                day = "Piątek";
                break;
            case 6:
                day = "Sobota";
                break;
            case 7:
                day = "Niedziela";
                break;
            default:
                day = "Podano złą wartość dnia ";
        }
        return day;
    }

    String isWorkingDay() {
        String day = "";
        if (dayNumber >0 && dayNumber <6) {
            day = "dzień roboczy.";
        } else if (dayNumber == 6 || dayNumber == 7) {
            day = "dzień wolny.";
        } else {
            day = "Nie wiadomo czy roboczy czy wolny.";

        }
        return day;
    }
}
