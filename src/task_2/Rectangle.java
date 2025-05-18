package task_2;

public class Rectangle extends General {
    public double a;
    public double b;
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double area() {
    return 2 * (a + b);
    }
    @Override
    public double perimeter() {
        return a * b;
    }
}
