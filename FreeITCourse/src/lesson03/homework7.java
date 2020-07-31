package lesson03;

// 7) Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99

public class homework7 {
    public static void main(String[] args) {

        int summa = 0;

        for (int i = 1; i <=99; i++) {
            if (i % 2 != 0)
                summa += i;
        }
        System.out.println("Result: " + summa);

    }
}
