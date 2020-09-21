package lesson07;
// Задание 24
// Создать класс и объекты описывающие промежуток времени.
// Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
// 1. Сделать методы для получения полного количества секунд в объекте, сравнения
// двух объектов (метод должен работать аналогично compareTo в строках).
// 2. Создать два конструктора: получающий общее количество секунд, и часы, минуты и секунды по отдельности.
// 3. Сделать метод для вывода данных.


public class MetodTask24 {
    public static void main (String[] args) {

        TimeInterval t1 = new TimeInterval(25000);
        TimeInterval t2 = new TimeInterval(3, 24, 45); // 12285 sec

// получаем полное количество секунд

        System.out.println("Полное количество секунд t1 = " + t1.getTotalSec());
        System.out.println("Полное количество секунд t2 = " + t2.getTotalSec());

// выводим данные

        System.out.println("Выводим параметры t1:");
        t1.printData();
        System.out.println("Выводим параметры t2:");
        t2.printData();

// сравниваем объекты
// если объект вызывающий больше, то выводим 1
// если объект вызывающий меньше, то выводим -1
// если объекты равны, то выводим 0

        System.out.println("Сравниваем объекты:");
        TimeInterval t3 = new TimeInterval(25000);
        System.out.println("t1 = " + t1.getTotalSec() + " с, t2 = " + t2.getTotalSec() + " с, результат: " + t1.compareTime(t2));
        System.out.println("t2 = " + t2.getTotalSec() + " с, t1 = " + t1.getTotalSec() + " с, результат: " + t2.compareTime(t1));
        System.out.println("t3 = " + t3.getTotalSec() + " с, t1 = " + t1.getTotalSec() + " с, результат: " + t3.compareTime(t1));

    }



}
