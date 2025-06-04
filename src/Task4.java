import java.util.Scanner;

public class Task4 {
    public void uniqueChars() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 строки:");
        String[] words = new String[3];
        for (int i = 0; i < 3; i++) {
            words[i] = scanner.next();
        }
        String result = null;
        for (String word : words) {
            if (hasUniqueChars(word)) {
                result = word;
                break;
            }
        }
        if (result != null) {
            System.out.println("Первое слово с разными символами: " + result);
        } else {
            System.out.println("Нет слов с разными символами");
        }
        scanner.close();
    }
    private static boolean hasUniqueChars(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
