package lesson03;
// Задание 12
// Найдите сумму первых n целых чисел, которые делятся на 3.

import java.util.Scanner;

public class MetodTask12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        int count = 0;
        int sum = 0;

        for (int i = 1; count < n; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }

        System.out.println("Сумма " + n + " первых чисел, которые делятся на 3 равна " + sum);
    }
}
