import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    /*Задача 1:
    Пользователь вводит набор чисел в виде одной строки с клавиатуры.
    Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
    Вывести результат на экран.
    При решении использовать коллекции.
    Задача 2:
    Создать класс, который будет хранить в себе коллекцию с названиями
    животных. Реализовать методы удаления и добавления животных по
    следующим правилам: добавляется всегда в начало коллекции, а удаляется
    всегда из конца. Показать работу объекта этого класса в main методе другого
    класса.
            Задача 3:
    На вход поступает массив строк, верните Map<String, Boolean>, где каждая
    отдельная строка является ключом, и ее значение равно true, если эта строка
    встречается в массиве 2 или более раз. Пример:
    wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
    wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
    wordMultiple(["c", "c", "c", "c"])→{"c": true}*/
    public static void main(String[] args) {
        // Первая задача
        Task1 task1 = new Task1();
        task1.delDublicat();
        // Вторая задача
        Task2 task2 = new Task2();
        task2.addAllAnimal("Monkey");
        task2.addFirstAnimals("Zebra");
        task2.removeAnimal();
        task2.printList();
        // Задача три
        System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wordMultiple(new String[]{"c", "b", "a"}));
        System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));
    }

    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Boolean> result = new HashMap<>();
        // Сначала все слова ставим как false
        for (String word : words) {
            result.put(word, false);
        }
        // Если слово встречается повторно, меняем на true
        for (String word : words) {
            if (result.get(word)) {  // Если уже true
                continue;           // Пропускаем
            }
            // Иначе проверяем, встречалось ли слово раньше
            if (Collections.frequency(Arrays.asList(words), word) >= 2) {
                result.put(word, true);
            }
        }
        return result;
    }
}