package task_2;
/*Задача 2:
Создать класс, описывающий банкомат. Набор купюр, находящихся в
банкомате, должен задаваться тремя свойствами: количеством купюр
номиналом 20, 50 и 100. Сделать метод для добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая принимает сумму денег, а
возвращает булевое значение - успешность выполнения операции. При
снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма. Создать конструктор*/
public class Atm {
    int nominal20;
    int nominal50;
    int nominal100;
    public Atm (int nominal20, int nominal50, int nominal100) {
        this.nominal20 = nominal20;
        this.nominal50 = nominal50;
        this.nominal100 = nominal100;
    }
    long sum_in_atm = 100;
    public void addMoney (long addSum) {
    sum_in_atm += addSum;
    }
    public boolean takeMoney(int amount) {
        int originalAmount = amount;
        int num100 = 0, num50 = 0, num20 = 0;
        // купюры по 100
        while (amount >= 100 && nominal100 > 0) {
            amount -= 100;
            nominal100--;
            num100++;
        }
        // купюры по 50
        while (amount >= 50 && nominal50 > 0) {
            amount -= 50;
            nominal50--;
            num50++;
        }
        // купюры по 20
        while (amount >= 20 && nominal20 > 0) {
            amount -= 20;
            nominal20--;
            num20++;
        }
        // Проверка выдачи
        if (amount == 0) {
            System.out.println("Выдано: " + num20 + " купюр по 20, " + num50 + " купюр по 50, " + num100 + " купюр по 100.");
            return true;
        } else {
            nominal100 += num100;
            nominal50 += num50;
            nominal20 += num20;
            System.out.println("Недостаточно средств для выдачи суммы: " + originalAmount + ".");
            return false;
        }
    }
    // инфо о количестве купюр в банкомате
    public void showStatus() {
        System.out.println("Текущий статус банкомата:");
        System.out.println("Количество купюр по 20: " + nominal20);
        System.out.println("Количество купюр по 50: " + nominal50);
        System.out.println("Количество купюр по 100: " + nominal100);
    }
}

