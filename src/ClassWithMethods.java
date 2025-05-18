import java.util.Scanner;

public class ClassWithMethods {
    Scanner scanner = new Scanner(System.in);
    int a = 10;
    int b = scanner.nextInt();
    public void except() { // один catch
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            if (b == 0) {
                System.out.println("На ноль делить нельзя");
            }
        }
        scanner.close();
    }
    public void moreExcept() { // несколько catch
        try {
            int[] c = new int[5];
            c[5] = b;
        } catch (ArithmeticException e) {
            if (b == 0) {
                System.out.println("На ноль делить нельзя");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
    }
        public void multiExcept () { // мульти catch
            try {
                System.out.println(a / b);
            } catch (NullPointerException | ArithmeticException e) {
                System.out.println("Неверное значение для операции");
            }
        }
            public void finallyExcept () { // finally
                try {
                    System.out.println(a / b);
                } catch (ArithmeticException e) {
                    if (b == 0) {
                        System.out.println("На ноль делить нельзя");
                    }
                }
                finally {
                    System.out.println("Завершение программы");
                }
        }
    }