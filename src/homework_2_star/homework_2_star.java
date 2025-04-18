package homework_2_star;
/*
Задача *:
Напишите программу, где пользователь вводит любое целое положительное
число.

А программа суммирует все числа от 1 до введенного пользователем числа. Для
ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
пользователь не мог ввести некорректные данные
 */

import java.util.Scanner;

public class homework_2_star {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int sum = 0;
        while (scanner.hasNextInt()) {
            a = scanner.nextInt();
            if (a <= 0) {
                if (a == 0) {
                    System.out.println("Введите значение положительное число");
                    return;
                }
                System.out.println("Вы ввели отрицательное число");
                return;
            }
            for (int i = 1; i < a + 1; i++) { // подсчёт чисел
                sum = sum + i;
            }
            System.out.println("Сумма чисел от 1 до " + a + " = " + sum);
            return;
        }
        System.out.println("Вы ввели не целое число");
        scanner.close();
    }
}
