package StepikTasks.BasicsJava;

import java.util.Scanner;

/**
 * ВАЛЛ-И 2
 * <p>
 * Робот ВАЛЛ-И каждый день меняет пароль от своей учетной
 * записи на обучающей платформе. Ему нравится придумывать числа
 * разной длины и суммировать их последние цифры.
 * К получившемуся значению он добавляет строчные согласные буквы,
 * входящие в его имя на латинице. Составьте программу для ВАЛЛ-И,
 * которая позволяла бы ему придумывать 3 любых целых
 * числа и выдавала бы пароль на текущий день.
 * Входные данные:
 * 3 натуральных числа
 * Выходные данные:
 * выведите ответ на задачу
 * (если в результате вычислений получается однозначное число,
 * то добавлять 0 в начале не нужно)
 * <p>
 * Sample Input 1:
 * 123
 * 204
 * 15689
 * <p>
 * Sample Output 1:
 * 16vll
 * <p>
 * Sample Input 2:
 * 1723
 * 13413477
 * 1205
 * <p>
 * Sample Output 2:
 * 15vll
 */
public class Task_1_3_2 {
    public static void main(String[] args) {
        wallePass();
    }

    public static void wallePass() {
        Scanner scanpass = new Scanner(System.in);
        int a = scanpass.nextInt() % 10;
        int b = scanpass.nextInt() % 10;
        int c = scanpass.nextInt() % 10;
        System.out.println(a + b + c + "vll");
        scanpass.close();
    }
}
