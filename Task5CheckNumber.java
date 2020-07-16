import java.util.Scanner;

public class Task5CheckNumber {
    public  static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любое 4-хзначное натуральное число");
        int n = scanner.nextInt();

        int num1 = n % 10;
        int num2 = (n - num1) / 10 % 10;
        int num3 = (n - num1 - num2) / 100 % 10;
        int num4 = (n - num1 - num2 * 10 - num3 * 100) / 1000;


        if (num1 != num2 & num1 != num3 & num1 != num4 & num2 != num3 & num2 != num4 & num3 != num4)
            System.out.println("цифры числа различны");
        else
            System.out.println("цифры числа не различны");
    }
}
