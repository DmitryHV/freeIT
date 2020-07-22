package lesson03;
// 1)Начав тренировки, спортсмен в первый день пробежал 10 км.
// Каждыйдень он увеличивал дневную норму на 10% нормы предыдущего дня.
// Какой суммарный путь пробежит спортсмен за 7 дней?

import java.text.DecimalFormat;

public class homework1 {
    public static void main(String[] args) {

        double distance = 10;
        double sumDistance = distance;

        for (int i = 2; i <= 7; i++) {
            distance = distance * 1.1;
            sumDistance = sumDistance + distance;
        }
        DecimalFormat df = new DecimalFormat("###.##");

        System.out.format("За 7 дней спортсмен пробежит суммарный путь равный " +  df.format(sumDistance) + " км.");
    }
}
