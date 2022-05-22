package StepikTasks.BasicsJava;

import java.util.Scanner;

/**
 *
 Шоколадка

 Требуется определить, можно ли от шоколадки размером
 n × m долек отломить k долек, если разрешается сделать
 один разлом по прямой между дольками
 (то есть разломить шоколадку на два прямоугольника).
 Входные данные
 Вводятся 3 числа: n, m и k; k не равно n × m.
 Гарантируется, что количество долек в шоколадке не превосходит 30000.
 Выходные данные
 Программа должна вывести слово YES,
 если возможно отломить указанное число долек,
 в противном случае вывести слово NO.

 Sample Input 1:
 3 2 4

 Sample Output 1:
 YES

 Sample Input 2:
 3 2 1

 Sample Output 2:
 NO
 */
public class Task_1_4_15 {
    public static void main(String[] args) {
        chocolate();
    }

    public static void chocolate() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int x = (a * b);
  if (x <= 30000){
      if (){
          System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        System.out.println();
        scan.close();
    }
}
