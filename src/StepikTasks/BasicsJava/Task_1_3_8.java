package StepikTasks.BasicsJava;

import java.util.Scanner;

/**
 *
 ВАЛЛ-И 8
 ВАЛЛ-И встретил n детей и хочет разделить между ними
 k яблок так, чтобы каждому досталось поровну.
 Не делящийся остаток он собирается отнести ЕВЕ.
 Сколько яблок достанется каждому ребенку? Сколько яблок получит ЕВА?
 Результат выведите в одной строке через пробел в указанном порядке.
 Входные данные:
 два натуральных числа:
 n - количество детей
 k - количество яблок

 Выходные данные:
 Sample Input 1:
 2
 6

 Sample Output 1
 3 0

 Sample Input 2
 4
 25

 Sample Output 2:
 6 1
 */
public class Task_1_3_8 {
    public static void main(String[] args) {
        apple();
    }
    public static void apple(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        System.out.println((k / n) + " " + (k % n));
        scan.close();
    }
}
