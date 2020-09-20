package lesson07;

public class TimeInterval {

        private int sec;
        private int min;
        private int hour;

        public TimeInterval (int sec) {
            this.sec = sec;
        }

        public TimeInterval (int hour, int min, int sec) {
            this.hour = hour;
            this.min = min;
            this.sec = sec;
        }

        public int getTotalSec () {
            int totalSec = hour * 3600 + min * 60 + sec;
            return totalSec;
        }

        public void getData () {
        System.out.println(hour + " hour(s), " + min + " min(es), " + sec + " sec(s).");
//            return str;
        }


}
