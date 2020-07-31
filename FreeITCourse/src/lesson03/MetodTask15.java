package lesson03;
// Задание 15
// Создать массив, заполнить его случайными элементами, распечатать,
// перевернуть, и снова распечатать (при переворачивании нежелательно создавать
// еще один массив).

public class MetodTask15 {
    public static void main(String[] args) {
        int array [] = new int [10];
        String space = ", ";
// initializate and print array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*10);
            if ( i == array.length - 1)
                space = "";
            System.out.print(array[i] + space);
        }
        System.out.println();
// flip the array
        int temp;
        for (int i = 0; i <= array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
// print array
        space = ", ";
        for (int i = 0; i < array.length; i++) {
            if ( i == array.length - 1)
                space = "";
            System.out.print(array[i] + space);
        }
    }
}
