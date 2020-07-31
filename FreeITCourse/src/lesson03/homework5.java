package lesson03;

// 5) Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
// для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

import java.text.DecimalFormat;

public class homework5 {
    public static void main(String[] args) {

        System.out.println("|  Дюймы  |  Сантиметры  |");

        DecimalFormat df = new DecimalFormat("###.##");

        for (int i = 1; i < 21; i++) {
            System.out.println("| \t" +i + "\t  | \t" + df.format(i*2.54) + "\t |");
        }
    }
}
