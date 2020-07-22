package lesson03;
// Задание 7
// Имеется прямоугольное отверстие размерами a и b,
// определить, можно ли его полностью закрыть круглой картонкой радиусом r.

import java.util.Scanner;

public class MetodTask07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размеры прямоугольного отверстия");
        System.out.print("a: ");
        double dimensionA = scanner.nextDouble();
        System.out.print("b: ");
        double dimensionB = scanner.nextDouble();

        System.out.print("Введите радиус картонки r: ");
        double radius = scanner.nextDouble();

        System.out.println(Math.sqrt(dimensionA*dimensionA+dimensionB*dimensionB)/2 <= radius ? "Можно закрыть картонкой" : "Нельзя закрыть картонкой");

    }
}
