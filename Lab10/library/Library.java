package library;

import java.util.Date;

public class Library {
    private Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    private Date getDayRent(Rent rent) {
        int day = rent.getEnd().getDay() - rent.getBegin().getDay();
        int month = rent.getEnd().getMonth() - rent.getBegin().getMonth();
        int year = rent.getEnd().getYear() - rent.getBegin().getYear();
        return new Date(year, month, day);
    }

    public Rent getLongestRent() {
        Rent max = rents[0];
        for (int i = 1; i < rents.length; i++) {
            if (getDayRent(max).compareTo(getDayRent(rents[i])) > 0) {
                max = rents[i];
            }
        }
        return max;
    }
}
