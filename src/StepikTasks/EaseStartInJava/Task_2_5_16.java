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
        if (sec == 86400) {
            System.out.println("00:00:00");
        } else {
            int hours = sec / 3600;
            int mint = (sec % 3600) / 60;
            sec = (sec % 3600) % 60;
            System.out.println((hours >= 0 && hours <= 9 ? ("0" + hours) : hours) +
                    ":" + (mint >= 0 && mint <= 9 ? ("0" + mint) : mint) +
                    ":" + (sec >= 0 && sec <= 9 ? ("0" + sec) : sec));
            scan.close();
        }
    }
}
