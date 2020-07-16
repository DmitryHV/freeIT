//  Дано целое число.
//  Если оно является положительным, то прибавить к нему 1.
//  Если отрицательным, то вычесть из него 2.
//  Если нулевым, то заменить его на10.
//  Вывести полученное число

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        long n = scanner.nextLong();
        if (n == 0)
            n = 10;
        else
            if (n > 0)
                n++;
            else
                n = n - 2;
        System.out.println("Результат: " + n);
    }
}
