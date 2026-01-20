package labs.lab2;

public class Year {
    private int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        if (year <= 1582)
            return year % 4 == 0;
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        return year % 4 == 0;
    }
}
