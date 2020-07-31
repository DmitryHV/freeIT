package lesson03;
// Задание 8
// Имеется целое число (задать с помощью Random rand = new Random(); int x = rand.nextInt() ).
// Это число – количесво денег в рублях.
// Вывести это число, добавив к нему слово «рублей» в правильном падеже.

import java.util.Random;

public class MetodTask08 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt();


        String ey = "рублей";
        String base = "рубль";
        String ya = "рубля";

        if (n % 100 != 11 & n%10==1)
            System.out.println(n + " " + base);
        else
        if ((n%100 >=11 & n%100 <= 14) | (n%10==0 | (n%10>=5 & n%10<=9)))
            System.out.println(n + " " + ey);
        else
            System.out.println(n + " " + ya);



    }
}
