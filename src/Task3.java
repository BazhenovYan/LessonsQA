import java.util.Scanner;

public class Task3 {
    public void middleLength() {
        Scanner scanner = new Scanner(System.in);
        // Ввод 3 строк
        System.out.println("Введите три строки:");
        String[] strings = new String[3];
        int totalLength = 0;
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
            totalLength += strings[i].length();
        }
        // Вычисление средней длины
        double averageLength = totalLength / 3.0;
        System.out.printf("\nСредняя длина строк: %.2f\n", averageLength);
        // Поиск и вывод строк с длиной меньше средней
        System.out.println("Строки с длиной меньше средней:");
        for (String s : strings) {
            if (s.length() < averageLength) {
                System.out.printf("'%s' (длина: %d)\n", s, s.length());
            }
        }
        scanner.close();
    }
}

