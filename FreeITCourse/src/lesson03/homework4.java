package lesson03;
// 4) Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A:" + "\t");
        int a = scanner.nextInt();

        System.out.print("Enter B:" + "\t");
        int b = scanner.nextInt();
        int result = 0;
        int sign = ((a >= 0 & b >= 0) | (a < 0 & b < 0)) ? 1 : -1;

        for (int i = 1; i <= Math.abs(b); i++) {
            result += Math.abs(a);
        }

        System.out.println("Result: \t" + result * sign );




    }


}
