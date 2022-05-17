package StepikTasks.EaseStartInJava;

import java.util.Scanner;

public class Task_3_2_12 {
    /**
     * На вход подаются целых три числа - день,
     * месяц и год (по григорианскому календарю).
     * Выведите true, если эти числа составляют
     * валидную дату, и false - в противном случае.
     * <p>
     * Sample Input 1:
     * 25 8 2010
     * <p>
     * Sample Output 1:
     * true
     * <p>
     * Sample Input 2:
     * 1 1 1
     * <p>
     * Sample Output 2:
     * true
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();
        if (year >= 0) {

            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day >= 1 && day <= 31) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day >= 1 && day <= 30) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            } else if (month == 2) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    if (day == 29) {
                        System.out.println("true");
                    }
                } else if (day <= 29) {
                    System.out.println("true");
                }
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }
}
