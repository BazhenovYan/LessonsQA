package homework_3;

import java.util.Arrays;
import java.util.Scanner;

/*
Для всех задач исходные условия следующие: пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его одним из двух способов: используя Math.random(), или
каждый элемент массива вводится пользователем вручную. Попробовать оба
варианта.
 */
public class homework_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int array_size = scan.nextInt();
        System.out.println("Размер массива равен: " + array_size);
        int[] array = new int[array_size];
        Scanner element = new Scanner(System.in);
        for (int i = 0; i < array_size; i++) {
            System.out.println("Введите элемент массива: ");
            array[i] = element.nextInt();
        }
        //Задача 1: Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
        System.out.println(Arrays.toString(array));
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //Задача 2: Найти минимальный - максимальный элементы и вывести в консоль.
        int min_value = array[0];
        int max_value = array[1];
        for (int i = 0; i < array.length; i++) {
            if (min_value > array[i]) {
                min_value = array[i];
            }
            if (array[i] > max_value) {
                max_value = array[i];
            }
        }
        System.out.println("Минимальное число в массиве: " + min_value);
        System.out.println("Максимальное число в массиве: " + max_value);
        System.out.println();
        // Задача 3: Найти индексы минимального и максимального элементов и вывести в консоль.
        int min_val = 0;
        int max_val = 0;
        int min_index = 0;
        int max_index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min_val > array[i]) {
                min_val = array[i];
                min_index = i;
            }
            if (array[i] > max_val) {
                max_val = array[i];
                max_index = i;
            }
        }
        System.out.println("Индекс минимального числа в массиве: " + min_index);
        System.out.println("Индекс максимального числа в массиве: " + max_index);
        System.out.println();
        /*Задача 4:
        Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
        вывести сообщение, что их нет.*/
        int zero_value = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zero_value++;
            }
        }
        if (zero_value != 0) {
            System.out.println("Количество нулевых элементов: " + zero_value);
        } else
            System.out.println("Нет нулевых элементов");
        System.out.println();
        //Задача 5. Пройти по массиву и поменять местами элементы первый и последний, второй и предпоследний и т.д.
        for (int i = 0; i < array.length / 2; i++) {
            int j = array.length - 1 - i;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println("Изменненный массив: " + Arrays.toString(array));
        /*Задача 6:
        Проверить, является ли массив возрастающей последовательностью (каждое
        следующее число больше предыдущего).*/
        boolean isGrowth = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isGrowth = false;
                break;
            }
        }
        if (isGrowth) {
            System.out.println("Массив не является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающим");
        }
    }
}
