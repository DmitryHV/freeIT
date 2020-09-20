package lesson05;
// Задание 22
// Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
// записаных по правилам Java, с помощью регулярных выражений и вывести их на
// страницу.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetodTask22 {
    public static void main(String[] args) {
        String str = "5E9ACD7B5   9E73C  95  123X  lkjkjlj   DF";
        Pattern pattern = Pattern.compile("[0-9A-F]+\\b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
