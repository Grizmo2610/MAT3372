public class Date {
    private int day;
    private int month;
    private int year;

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public int maxDayInMonth() {
        if (month == 2) {
            if (isLeapYear())
                return 29;
            return 28;
        }
        final int[] SMALLMONTHS = { 4, 6, 9, 11 };
        for (int mon : SMALLMONTHS)
            if (mon == month)
                return 30;
        return 31;
    }

    private void formatMonth() {
        while (month > 12) {
            month -= 12;
            year += 1;
        }
        while (month < 1) {
            month += 12;
            year -= 1;
        }
    }

    private void formatDate() {
        formatMonth();
        int maxDay = maxDayInMonth();
        while (day > maxDay) {
            day -= maxDay;
            month += 1;
            formatMonth();
            maxDay = maxDayInMonth();
        }
        while (day < 1) {
            month -= 1;
            formatMonth();
            maxDay = maxDayInMonth();
            day += maxDay;
        }
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        formatDate();
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
        formatDate();
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
        formatDate();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        formatDate();
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", day, month, year);
    }

    public static void main(String[] args) {
        Date date1 = new Date(26, 10, 2003);
        System.out.println(date1);

        date1.setDay(30);
        System.out.println(date1);
        date1.setDay(-30);
        System.out.println(date1);

        date1.setMonth(11);
        System.out.println(date1);
        date1.setDay(31);
        System.out.println(date1);

        System.out.println("Day: " + date1.getDay());
        System.out.println("Month: " + date1.getMonth());
        System.out.println("Year: " + date1.getYear());

        date1.setDate(26, 10, 2003);
        System.out.println(date1);
    }
}
