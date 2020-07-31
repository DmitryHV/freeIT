package lesson03;
// 2) Одноклеточная амеба каждые 3 часа делится на 2 клетки.
// Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

public class homework2 {
    public static void main(String[] args) {

        int n = 1;  //set the number of amoebas ))
        int hour = 0; //set the time

        do {
            hour += 3;
            n *= 2;
            System.out.println("After " + hour + " hours will be " + n + " amoebas");
        } while (hour < 24);

    }
}
