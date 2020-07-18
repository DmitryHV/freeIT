/* В переменную записываем число.
   Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
   Например, "это однозначное положительное число".
   Достаточно будет определить, является личисло однозначным, "двухзначным или трехзначным и более

*/
import java.util.Scanner;

public class Task1DescNumber {
    public static void main (String args []) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scanner.nextInt();

        String s2;
        if (n > 0)
            s2 = " положительное число";
        else
            s2 = " отрицательное число";

        int n1 = n/10;
        int n2 = n/100;
        String s1 = null;
        if (n1 == 0)
            s1 = "однозначное";
        else
            if (n2 == 0)
                s1 = "двузначное";
            else
                s1 = "трехзначное и более";

        System.out.println("Это " + s1 + s2);
    }
}
