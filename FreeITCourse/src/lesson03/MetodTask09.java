package lesson03;
// Задание 9
// Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма,
// а произведение, т.е. факториал числа.

public class MetodTask09 {
    public static void main(String[] args) {
        int result =1;
        int n = 1;
        int x = (int)(Math.random()*20);

        while (n <= x) {
            result *= n;
            n++;
        }

        System.out.println("Факториал числа " + x + " равен " + result);
    }

}
