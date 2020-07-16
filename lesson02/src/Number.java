import java.util.Scanner;

public class Number {
    public  static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любое 4-хзначное натуральное число");
        int n = scanner.nextInt();

        int num1 = n%10;
        int num2 = (n - num1) / 10 % 10;
        int num3 = (n - num1 - num2) / 100 % 10;
        int num4 = (n - num1 - num2 * 10 - num3 * 100) / 1000;

        int number = num1 * 1000 + num2 * 100 + num3 * 10 + num4;

        System.out.println("Искомое число: " + number);

    }
}
