public class Time {
    private int second;
    private int minute;
    private int hour;

    private void formatHour(){
        while (hour > 23)
            hour -= 24;
        while (hour < 0)
            hour += 24;
    }
    private void formatMinute(){
        while (minute > 59) {
            minute -= 60;
            hour += 1;
        }
        while (minute < 0){
            minute += 60;
            hour -= 1;
        }
        formatHour();
    }
    private void formatSecond(){
        while (second > 59) {
            second -= 60;
            minute += 1;
        }
        while (second < 0){
            second += 60;
            minute -= 1;
        }
        formatMinute();
    }

    public Time(int hour, int minute, int second) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
        formatSecond();
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
        formatSecond();
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        formatMinute();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        formatHour();
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void setTime(int hour, int minute, int second){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
        formatSecond();
    }

    public Time nextSecond(){
        second += 1;
        formatSecond();
        return this;
    }
    public Time previousSecond(){
        second -= 1;
        formatSecond();
        return this;
    }

    public static void main(String[] args) {
        // Test constructors and toString()
        Time time1 = new Time(1, 2, 3);
        System.out.println(time1); // toString()

        // Test Setters and Getters
        time1.setHour(4);
        time1.setMinute(5);
        time1.setSecond(6);
        System.out.println(time1); // toString()
        System.out.println("Hour: " + time1.getHour());
        System.out.println("Minute: " + time1.getMinute());
        System.out.println("Second: " + time1.getSecond());

        // Test setTime()
        time1.setTime(23, 59, 58);
        System.out.println(time1); // toString()

        // Test nextSecond();
        System.out.println(time1.nextSecond());
        System.out.println(time1.nextSecond().nextSecond());

        // Test previousSecond();
        System.out.println(time1.previousSecond());
        System.out.println(time1.previousSecond().previousSecond());
    }

}
