// Даны 2 числа. Вывести большее из них.

import java.util.Scanner;

public class Task6GreaterNumber {
    public static void main(String[] args) {

        System.out.println("Введите 2 целых числа:");
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1 != n2)
            if (n1 > n2)
                System.out.println("Большее число " + n1);
            else
                System.out.println("Большее число " + n2);

    }
}
