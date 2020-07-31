package lesson03;
// Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е таким образом:
//  1 1 1 1 1
//  0 1 1 1 0
//  0 0 1 0 0
//  0 1 1 1 0
//  1 1 1 1 1
public class MetodTask17 {
    public static void main(String[] args) {

        int array [][] = new int[5][5];
        int x = array.length /2;

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < x; j++) {
                if (i < x & i <= j) {
                        array[i][j] = 1;
                        array[i][array.length-1-j] = 1;
                        array[array.length - 1 - i][j] = 1;
                        array[array.length - 1 - i][array.length-1-j] = 1;
                }
            }
            if (array.length % 2 != 0) array[i][x] = 1;
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
