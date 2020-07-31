package lesson03;
// Задание 6
// Создайте число. Определите, является ли число трехзначным.
// Определите, является ли его последняя цифра семеркой.
// Определите, является ли число четным.

import java.util.Scanner;

public class MetodTask06 {
    public static void main(String[] args) {

        System.out.print("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number / 1000 == 0 & number / 100 != 0 ? "Число является трехзначным" : "Число не является трехзначным");
        System.out.println(number % 10 == 7 ? "Последняя цифра числа - 7" : "Последняя цифра числа не 7");
        System.out.println(number % 2 == 0 & number != 0 ? "Число четное" : "Число нечетное");

    }


}
