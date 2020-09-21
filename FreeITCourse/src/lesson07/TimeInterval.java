package lesson07;

public class TimeInterval {

    private int sec;
    private int min;
    private int hour;

    public TimeInterval(int sec) {
        this.sec = sec;
    }

    public TimeInterval(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getTotalSec() {
        return hour * 3600 + min * 60 + sec;
    }

    public void printData() {
        System.out.println("hour = " + hour + "; \n" + "min = " + min + "; \n" + "sec = " + sec + ";");
    }

    public int compareTime(TimeInterval T) {
        int totalSec1 = this.hour * 60 * 60 + this.min * 60 + this.sec;
        int totalSec2 = T.hour * 60 * 60 + T.min *60 + T.sec;
        if (totalSec1 == totalSec2)
            return  0;
        else return totalSec1 > totalSec2 ? 1 : -1;
    }


}
