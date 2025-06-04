import java.util.*;

/*Задача 1:
    Пользователь вводит набор чисел в виде одной строки с клавиатуры.
    Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
    Вывести результат на экран.
    При решении использовать коллекции.
    Задача 2:
    */
public class Task1 {
    public void delDublicat() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 5);
        Set<Integer> delDublicats = new HashSet<>(numbers); // удаление дубликатов пир помощи hashset
        //возврат в том же порядке
        List<Integer> result = new ArrayList<>(delDublicats);
        System.out.println(result);
    }
}