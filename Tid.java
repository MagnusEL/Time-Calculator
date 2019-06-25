package www.magnusel.com;

public class Tid {
    private int hour;
    private int minute;
    private int second;
    private int sumMinutes;
    private int sumSeconds;
    private final double decimalIn60 = 0.0166666666666667;
    private final double perCentTime = 1.666666666666667;

    public Tid(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.sumMinutes = (this.hour * 60) + this.minute + (this.second / 60);
        this.sumSeconds = (this.hour * 60 * 60) + (this.minute * 60) + this.second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public double calculatePerCentHours() {
        return Math.round(perCentTime * this.sumMinutes);
    }

    public double calculateDecimalHours() {
        return Math.round(decimalIn60 * this.sumMinutes * 100.0) / 100.0;
    }

    public double calculatePerCentMinute() {
        return Math.round(perCentTime * this.sumSeconds);
    }

    public double calculateDecimalMinutes() {
        return Math.round(decimalIn60 * this.sumSeconds * 100.0) / 100.0;
    }

}