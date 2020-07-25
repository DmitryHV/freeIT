package lesson03;
// Задание 13
// Создать последовательность случайных чисел, найти и вывести наибольшее из них.

import java.util.Random;

public class MetodTask13 {
    public static void main(String[] args) {

        int array [] = new int [20];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*10);
//            System.out.print(array[i] + " ");
        }
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Maximum number is " + max);
    }
}
