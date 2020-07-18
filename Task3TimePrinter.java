//        Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
//        А) минут + секунд,
//        В) часов + минут + секунд,
//        С) дней + часов + минут + секунд,
//        D) недель + дней + часов + минут + секунд.

public class Task3TimePrinter {
    public static void main(String [] args) {
        int s = 4500;
        int sec = s%60;
        int m = (s-sec)/60;
        System.out.println(m + " минут " + sec + " секунд");

        int min = m%60;
        int h = (m-min)/60;
        System.out.println(h + " часов " + min + " минут " + sec + " секунд");

        int hours = h%24;
        int d = (h - hours)/24;
        System.out.println(d + " дней " + hours + " часов " + min + " минут " + sec + " секунд");

        int days = d%24;
        int w = (d - days)/7;
        System.out.println(w + " недель " + days + " дней " + hours + " часов " + min + " минут " + sec + " секунд");
    }
}
