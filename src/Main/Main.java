package Main;

import homework_1.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        Task_1_1 task_1 = new Task_1_1(3,5);
        task_1.sumNumbers();
        System.out.println("Задача 2");
        Task_1_2 task_2 = new Task_1_2();
        task_2.sum2();
        System.out.println("Задача 3");
        Task_1_3 task_3 = new Task_1_3();
        task_3.sum3();
        System.out.println("Задача 4");
        Task_1_4 task_4 = new Task_1_4();
        task_4.sum4();
        System.out.println("Задача 5");
        Task_1_5 task_5 = new Task_1_5();
        task_5.sum5();
    }
}