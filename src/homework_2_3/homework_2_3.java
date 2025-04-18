package homework_2_3;

/*
Задача 3:
Составьте программу, выводящую на экран квадраты чисел от 10 до 20
включительно.
 */
public class homework_2_3 {

    public static void main(String[] args) {
        int a = 10;
        for (int i = 10; i <= 20; i++) {
            int b = a * a;
            a++;
            System.out.println(b);
        }
    }
}
