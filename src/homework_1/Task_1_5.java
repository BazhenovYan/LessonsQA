package homework_1;

import java.util.Scanner;

/*В переменных q и w хранятся два натуральных числа. Создайте программу,
выводящую на экран результат деления q на w с остатком. Пример вывода
программы (для случая, когда в q хранится 21, а в w хранится 8):
21 / 8 = 2 и 5 в остатке. */
public class Task_1_5 {
    int a;
    int b;
    public void sum5() {
        /* для интереса попробовал добавить сканнер
        (хотел еще сделать проверки на натуральные числа, но что-то уже забыл как это делается :( )*/
        Scanner number = new Scanner(System.in);
        System.out.println("Введите делитель в виде натурального числа: ");
        b = number.nextInt();
        Scanner splitter = new Scanner(System.in);
        System.out.println("Введите делитель в виде натурального числа: ");
        b = splitter.nextInt();
        int surplus = a % b;
        int separation = a / b;
        System.out.println(separation + " и " + surplus + " в остатке.");
    }
}
