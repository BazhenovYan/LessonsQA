import java.util.Scanner;
public class Task5 {
    public void moreChars () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            result.append(c).append(c);
        }
        System.out.println("Результат: " + result);
        scanner.close();
    }
}
