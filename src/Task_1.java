import java.util.Scanner;

/*
Задача 1:
Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
Вывести найденные строки и их длину.
 */
public class Task_1 {
    public void search() {
        Scanner src = new Scanner(System.in);
        String a = src.nextLine();
        String b = src.nextLine();
        String c = src.nextLine();
        String[] arr = {a,b,c};
        String minLine = arr[0];
        String maxLine = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < minLine.length()) {
                minLine = arr[i];
            }
            if (arr[i].length() > maxLine.length()) {
                maxLine = arr[i];
            }
        }
        System.out.println("Минимальная строка " + minLine + " из " + minLine.length() + " элементов");
        System.out.println("Максимальная строка " + maxLine + " из " + maxLine.length() + " элементов");
    src.close();
    src2.close();
    src3.close();
    }
}
