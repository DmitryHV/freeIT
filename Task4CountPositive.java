//Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.

import java.util.Scanner;

public class Task4CountPositive {
    public static void main(String[] args) {
        System.out.println("Введите 3 целых числа:");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int count = 0;
        if (n1 > 0)
            count++;
        if (n2 > 0)
            count++;
        if (n3 > 0)
            count++;
        System.out.println("Количество положительных чисел - " + count);

    }
}
