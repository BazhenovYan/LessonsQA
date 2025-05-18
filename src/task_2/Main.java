package task_2;
homework_6
/*
Задача 2:
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
периметра(используя абстрактный класс/методы). Создать массив из 5 разных
фигур. Вывести на экран сумму периметра всех фигур в массиве
 */
public class Main {
    public static void main(String[] args) {
        General[] generals = new General[5];
        generals[0] = new Rectangle(9,2);
        generals[1] = new Circle(5);
        generals[2] = new Circle(5);
        generals[3] = new Rectangle(4,3);
        generals[4] = new Triangle(3,5,1);
        double totalPerimeter = 0;
        for(General general : generals) {
            totalPerimeter += general.perimeter();
        }
        System.out.println("Сумма периметров всех фигур: " + totalPerimeter);
        }
        }