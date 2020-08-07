package lesson05;
// Имеется строка с текстом.
// Подсчитать количество слов в тексте.
// Желательно учесть, что слова могут разделяться несколькими пробелами,
// в начале и конце текста также могут быть пробелы, но могут и отсутствовать.

public class MetodTask19 {
    public static void main(String[] args) {
        String str = "Строковый литерал - это последовательность символов, заключенных в двойные кавычки.";
//        String str = "     про45jkl    jkjkj ";
//        String str = " ...Написано не ! .., пойми что... - просто проверка ";
        char symbol;
        int countWords = 0;

        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);

            if (!(symbol == ' ' || symbol == '.' || symbol == ',' || symbol == ';' || symbol == ':' || symbol == '-' || symbol == '?' || symbol == '!')) {
                while (i < str.length() && !(symbol == ' ' || symbol == '.' || symbol == ',' || symbol == ';' || symbol == ':' || symbol == '-' || symbol == '?' || symbol == '!')) {
                    i++;
                    if (i != str.length())
                        symbol = str.charAt(i);
                }

                countWords++;
            }
        }
        System.out.print("Количество слов в тексте равно " + countWords);
    }
}
