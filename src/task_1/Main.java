package task_1;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(1234567890, 400);
        CreditCard card2 = new CreditCard(298765432, 400);
        CreditCard card3 = new CreditCard(109080706, 400);
        card1.addMoney(200);
        card2.addMoney(500);
        card3.reduceMoney(100);
        card1.infoAccNumber();
        card2.infoAccNumber();
        card3.infoAccNumber();
    }
}