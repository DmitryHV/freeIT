package lesson02.src;//Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.

import java.util.Scanner;

public class Task5Count {
    public static void main(String[] args) {
        System.out.println("Введите 3 целых числа:");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int countPlus = 0;
        int countMinus = 0;

        if (n1 > 0)
            countPlus++;
        else
            if (n1 < 0)
                countMinus++;

        if (n2 > 0)
            countPlus++;
        else
            if (n2 < 0)
                countMinus++;

        if (n3 > 0)
            countPlus++;
        else
            if (n3 < 0)
                countMinus++;

        System.out.println("Количество положительных чисел - " + countPlus);
        System.out.println("Количество отрицательных чисел - " + countMinus);
    }
}
