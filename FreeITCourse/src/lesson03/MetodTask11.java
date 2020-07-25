package lesson03;
// Задание 11
// Имеется целое число, определить является ли это число простым, т.е.
// делится без остатка только на 1 и себя.

import java.util.Scanner;

public class MetodTask11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String text = "The number is prime";

        do {
            System.out.print("Enter simple number: ");
            n = scanner.nextInt();
            if (n <= 1)
                System.out.println("You entered invalid number!");
        } while (n <= 1);

        for (int i = 2; i <= n; i++) {
            if (n % i == 0 & i != n) {
                text = "The number is not prime";
                break;
            }
        }

        System.out.println(text);

    }
}
