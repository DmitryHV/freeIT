package lesson05;

// Задание 23
// Написать программу, выполняющую поиск в строке всех тегов абзацев,
// в т.ч. тех, у которых есть параметры,
// например <p id=”p1”>, и замену их на простые теги абзацев <p>.

public class MetodTask23 {
    public static void main(String[] args) {
        String str = "<p id=”Start of string”>,  <p id=”I'm don't know how it works.))”,p id=”It was a joke.”>  ,<p>  ,   <p id=”end.”>,";
        System.out.println(str.replaceAll("\\<p.*?\\>", "<p>"));

    }


}

