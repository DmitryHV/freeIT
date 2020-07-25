package lesson03;
// Задание 16
// Определите сумму элементов одномерного массива,
// расположенных между минимальным и максимальным значениями.

public class MetodTask16 {
    public static void main(String[] args) {
        int array [] = {-1, 2, -25, 0, 8, 10, -25, -3, 5, 15, 6, 15};
        int min = array[0];
        int max = array[0];
// find min and max elements of array
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("min " + min + " max " + max);
// find first index of min and max elements
        int countMin = 0;
        int countMax = 0;
        int indMin = 0;
        int indMax = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min & countMin == 0) {
                indMin = i;
                countMin++;
            }
            if (array[i] == max & countMax == 0) {
                indMax = i;
                countMax++;
            }
        }
// find sum elements between min and max
        int sum = 0;
        if (indMin < indMax)
            for (int i = indMin +1; i < indMax; i++ )
                sum += array[i];
            else
                for (int i = indMax +1; i < indMin; i++)
                    sum += array[i];


        System.out.println("Summa between min and max elements equals " + sum);
    }
}
