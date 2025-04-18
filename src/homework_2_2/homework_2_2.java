package homework_2_2;

import java.util.Scanner;

/*
Задача 2:
Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести
«Warm».
Если –5>= t >–20, то вывести «Normal». Если –20>= t, то вывести «Cold».
 */
public class homework_2_2 {

    public static void main(String[] args) {
        Scanner scantemp = new Scanner(System.in);
        int temp = scantemp.nextByte();
        if (temp > -5) {
            System.out.println("Warm");
        }
        if (-5 >= temp && temp > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
        scantemp.close();
    }
}
