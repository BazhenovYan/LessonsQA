import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/*
Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
возрастания значений их длины.
 */

public class Task2 {
    public void rising() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1 строку:");
        String str1 = scanner.nextLine();
        System.out.println("Введите 2 строку:");
        String str2 = scanner.nextLine();
        System.out.println("Введите 3 строку:");
        String str3 = scanner.nextLine();
        String[] strings = {str1, str2, str3};
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        System.out.println("Строки в порядке возрастания:");
        for (String str : strings) {
            System.out.println( str + "(длина: " + str.length() + ")");
        }
        scanner.close();
    }
}