package lesson05;


import java.util.Date;


// Задание 21
// Напишите три цикла выполняющих многократное сложение строк,
// один с помощью оператора сложения и String,
// другой с помощью StringBuilder и метода append,
// а также аналогино для StringBuffer.
// Сравните скорость их выполнения.
public class MetodTask21 {
    public static void main(String[] args) {
// check String +

        String str = "Check  of add";
        String addStr = " string ";
        Date date1 = new Date();
        for (int i = 0; i < 30000 ; i++) {
            str += addStr;
        }
        Date date2 = new Date();
        long result1 = date2.getTime() - date1.getTime();
        System.out.println("Total time for String + equals: " + result1 + " milisecond(s)");

// check StringBuilder

        StringBuilder strB = new StringBuilder("Check  of add");
        Date date3 = new Date();
        for (int i = 0; i < 30000 ; i++) {
            strB.append(addStr);
        }
        Date date4 = new Date();
        long result2 = date4.getTime() - date3.getTime();
        System.out.println("Total time for StringBuilder equals: " + result2 + " milisecond(s)");

// check StringBuffer

        StringBuffer sb = new StringBuffer("Check  of add");
        Date date5 = new Date();
        for (int i = 0; i < 30000 ; i++) {
            sb.append(addStr);
        }
        Date date6 = new Date();
        long result3 = date6.getTime() - date5.getTime();
        System.out.println("Total time for StringBuffer equals: " + result3 + " milisecond(s)");
    }
}
