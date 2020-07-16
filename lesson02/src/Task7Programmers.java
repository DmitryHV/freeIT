// В переменную записываете количество программистов.
// В зависимости от количества программистов необходимо вывести правильно окончание.
// Например: • 2 программиста • 1 программист • 10 программистов • и т.д.

import java.util.Scanner;

public class Task7Programmers {
    public static void main(String[] args) {
        System.out.print("введите количество программистов: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String ov = "программистов";
        String base = "программист";
        String a = "программиста";

        if (n % 100 != 11 & n%10==1)
            System.out.println(n + " " + base);
        else
            if ((n%100 >=11 & n%100 <= 14) | (n%10==0 | (n%10>=5 & n%10<=9)))
                System.out.println(n + " " + ov);
            else
                System.out.println(n + " " + a);


    }
}
