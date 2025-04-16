package homework_1;

/*Написать приложение, которое будет вычислять и выводить значение по
формуле: a=4*(b+c-1)/2;
b и c задаем в коде самостоятельно.
 */

public class Task_1_1 {
    int a;
    int b;
    int c;
    public Task_1_1(int b, int c) {
        this.b = b;
        this.c = c;

    }
    public void sumNumbers() {
        a = 4 * (b + c - 1) / 2;
        System.out.println(a);
    }
}