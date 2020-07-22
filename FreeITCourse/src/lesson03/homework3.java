package lesson03;
// 3) Вычислить: 1+2+4+8+...+256

public class homework3 {
    public static void main(String[] args) {

        int count = 1;
        int summa = 0;

        do {
            summa += count;
            count += count;

        } while (count <= 256);

        System.out.println("Result: " + summa);
    }
}
