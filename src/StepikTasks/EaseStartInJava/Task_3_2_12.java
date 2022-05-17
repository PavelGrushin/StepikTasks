package StepikTasks.EaseStartInJava;
import java.util.Scanner;
public class Task_3_2_12 {
    /**
     На вход подаются целых три числа - день,
     месяц и год (по григорианскому календарю).
     Выведите true, если эти числа составляют
     валидную дату, и false - в противном случае.

     Sample Input 1:
     25 8 2010

     Sample Output 1:
     true

     Sample Input 2:
     1 1 1

     Sample Output 2:
     true
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();
        if (day >=1 && day <=31 && month >=1 && month <=1 && year >=1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
