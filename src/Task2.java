import java.util.LinkedList;

/*
 Задача 2:
    Создать класс, который будет хранить в себе коллекцию с названиями
    животных. Реализовать методы удаления и добавления животных по
    следующим правилам: добавляется всегда в начало коллекции, а удаляется
    всегда из конца. Показать работу объекта этого класса в main методе другого
    класса.
 */
public class Task2 {
    public LinkedList<String> animals = new LinkedList<>(); // Используем LinkedList для эффективного добавления/удаления
    public void addAllAnimal(String animal) { //Заполнение пустой коллекции первоначальным значением
        animals.add(animal);
    }
    public void addFirstAnimals(String animal) { //Добавление нового животного на первое место
        animals.addFirst(animal);
    }
    public void removeAnimal() {
        animals.removeLast(); // Удаление животного из конца колеекции
    }
    public void printList() { // Вывод того, что находится в коллекции
        System.out.println(animals);
    }
}