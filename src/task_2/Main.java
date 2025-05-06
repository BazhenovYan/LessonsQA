package task_2;

public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm(10,10,10);
        atm.addMoney(1000);
        atm.takeMoney(420);
        atm.showStatus();
    }
}
