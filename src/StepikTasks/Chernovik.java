package StepikTasks;

import java.util.Scanner;

public class Chernovik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int month = scan.nextInt();


        if (day >= 1 && day <= 31) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println("true");
            }else
                System.out.println("false");
        }
    }
}