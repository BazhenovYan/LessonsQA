package task_1;
/*Задача 1:
Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке. Напишите
программу, которая создает три объекта класса CreditCard у которых заданы
номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и
снимите с третьей. Выведите на экран текущее состояние всех трех карточек.*/
public class CreditCard {
    long accNumber;
    double currentNumber;
    public CreditCard (long accNumber, double currentNumber) {
        this.accNumber = accNumber;
        this.currentNumber = currentNumber;
    }
    // Добавьте метод, который позволяет начислять сумму на кредитную карточку.
    public void addMoney(double plusMoney) {
        currentNumber += plusMoney;
    }
    // Добавьте метод, который позволяет снимать с карточки некоторую сумму.
    public void reduceMoney(double minusMoney) {
        currentNumber -= minusMoney;
    }
    public void infoAccNumber(){
        System.out.println("Номер карты: " + accNumber + "\nДенежных средств на счете: " + currentNumber);
    }
}