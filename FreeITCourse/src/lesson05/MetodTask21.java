package lesson05;


import java.lang.reflect.Array;
import java.util.Date;


// Задание 21
// Напишите три цикла выполняющих многократное сложение строк,
// один с помощью оператора сложения и String,
// другой с помощью StringBuilder и метода append,
// а также аналогино для StringBuffer.
// Сравните скорость их выполнения.
public class MetodTask21 {
    public static void main(String[] args) {
// run programm 3 times
// check String +

         String str = "Check  of add";
         String addStr = " string ";
//         Date date1 = new Date();
         long start1 = System.nanoTime();
         for (int i = 0; i < 30000; i++) {
             str += addStr;
         }
//         Date date2 = new Date();
//         long result1 = date2.getTime() - date1.getTime();
//         System.out.println("Total time for String + equals: " + result1 + " milisecond(s)");
         long finish1 = System.nanoTime();
        System.out.println("String+ " + (finish1 - start1)/1000000);


// check StringBuilder

         StringBuilder stringBuilder = new StringBuilder("Check  of add");
//         Date date3 = new Date();
         long start2 = System.nanoTime();
         for (int i = 0; i < 30000; i++) {
             stringBuilder.append(addStr);
         }
//         Date date4 = new Date();
//         long result2 = date4.getTime() - date3.getTime();
//         System.out.println("Total time for StringBuilder equals: " + result2 + " milisecond(s)");
         long finish2 = System.nanoTime();
        System.out.println("StringBuilder " + (finish2 - start2)/1000000);

// check StringBuffer

         StringBuffer stringBuffer = new StringBuffer("Check  of add");
//         Date date5 = new Date();
         long start3 = System.nanoTime();
         for (int i = 0; i < 30000; i++) {
             stringBuffer.append(addStr);
         }
//         Date date6 = new Date();
//         long result3 = date6.getTime() - date5.getTime();
//         System.out.println("Total time for StringBuffer equals: " + result3 + " milisecond(s)");
         long finish3 = System.nanoTime();
        System.out.println("StringBuffer " + (finish3 - start3)/1000000);


//        Результаты 3-х замеров времени выполнения в мс:
//        String+           19670   18861   18833
//        StringBuilder     2       2       2
//        StringBuffer      13      13      13

    }
}
