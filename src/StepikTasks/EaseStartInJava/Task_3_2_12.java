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
        if (year >= 1 && day >= 1 && day <= 31) {
            switch (month) {
                case 1:
                    if (day <= 31) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                    break;
                case 2:
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        if (day == 29) {
                            System.out.println("true");
                        }
                    } else if (day <= 28) {
                        System.out.println("true");
                    }else {
                        System.out.println("false");
                    }
                    break;
                case 3:
                    if (day <= 31) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                    break;
                case 4:
                    if (day <= 30) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                    break;
                case 5:
                    if (day <= 31) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                    break;
                case 6:
                    if (day <= 30) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                    break;
                case 7:
                    if (day <= 31) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                    break;
                case 8:
                    if (day <= 31) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                    break;
                case 9:
                    if (day <= 30) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                    break;
                case 10:
                    if (day <= 31) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                    break;
                case 11:
                    if (day <= 30) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                    break;
                case 12:
                    if (day <= 31) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                    break;
                default:
                    System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }
}