package lesson05;
// Задание 20
// Имеется строка с текстом.
// Вывести текст, составленный из последних букв всех слов.

public class MetodTask20 {
    public static void main(String[] args) {
        String str = "Строковый литерал - это последовательность символов, заключенных в двойные кавычки.  ";
//        String str = "     проjkl    jkjkj ";
//        String str = " ...Написано не ! .., пойми что... - просто проверка ";
        char symbol;
        String text = "";

        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);

            if (!(symbol == ' ' || symbol == '.' || symbol == ',' || symbol == ';' || symbol == ':' || symbol == '-' || symbol == '?' || symbol == '!')) {
                while (i < str.length() && !(symbol == ' ' || symbol == '.' || symbol == ',' || symbol == ';' || symbol == ':' || symbol == '-' || symbol == '?' || symbol == '!')) {
                    i++;
                    if (i != str.length())
                        symbol = str.charAt(i);
                }
                text += str.charAt(i-1);
            }
        }
        System.out.println("Текст из последних букв слов - " + text);
    }
}
