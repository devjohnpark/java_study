package objectoriented.modifier;

public class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            return;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            return;
        }
        this.minute = minute;
    }

    public static void main(String[] args) {
        Time time = new Time(10, 20, 30);
        time.setHour(5);
        time.setMinute(5);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
    }
}
