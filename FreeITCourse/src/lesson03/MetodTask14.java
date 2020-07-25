package lesson03;
// Задание 14
// Создать массив оценок произвольной длины,
// вывести максимальную и минимальную оценку, её (их) номера.

public class MetodTask14 {
    public static void main(String[] args) {

        int array [] = new int [10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*10+1);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int max = array[0];
        int numOfMax = 0;
        int min = array[0];
        int numOfMin = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                numOfMax = i;
            }
            if (array[i] <= min) {
                min = array[i];
                numOfMin = i;
            }
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Its index(s)");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max)
                System.out.print(i + "  ");
        }
        System.out.println();

        System.out.println("Minimum number is " + min);
        System.out.println("Its index(s)");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min)
                System.out.print(i + "  ");
        }
    }
}
