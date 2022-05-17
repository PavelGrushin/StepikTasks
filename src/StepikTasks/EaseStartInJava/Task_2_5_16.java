package StepikTasks.EaseStartInJava;

import java.util.Scanner;

/**
 * Реализуйте простые домашние часы.
 * <p>
 * На вход подаётся число секунд,
 * которое прошло с момента начала суток (00:00:00).
 * Выведите текущее время в формате ЧЧ:ММ:СС.
 * Примечание 1. Используйте 24-часовой формат.
 * Примечание 2. Для преобразования типа int в тип String
 * (если это понадобится) можно использовать встроенный
 * служебный метод String.valueOf(num),
 * который преобразует число num в строку "num".
 * <p>
 * Sample Input 1:
 * 41000
 * <p>
 * Sample Output 1:
 * 11:23:20
 * <p>
 * Sample Input 2:
 * 3600
 * <p>
 * Sample Output 2:
 * 01:00:00
 */
public class Task_2_5_16 {
    public static void main(String[] args) {
        clock();
    }

    public static void clock() {
        Scanner scan = new Scanner(System.in);
        int sec = scan.nextInt(); //в одном часе 3600 секунд!
        int hours = sec / 3600;
        int mint = (sec % 3600) / 60;
        sec = (sec % 3600) % 60;
        String a = Integer.toString(hours);
        String b = Integer.toString(mint);
        String c = Integer.toString(sec);
        if (hours >= 0 && hours <= 9) {
            a = "0" + a;
        } else if (mint >= 0 && mint <= 9) {
            b = "0" + b;
        } else if (sec >= 0 && sec <= 9) {
            c = "0" + c;
        }
        System.out.println(a + ":" + b + ":" + c);
        scan.close();
    }
}
