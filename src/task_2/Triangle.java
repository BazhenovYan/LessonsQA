package task_2;

public class Triangle extends General {
    public double a;
    public double b;
    public double c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double perimeter(){
        return a + b + c;
    }
    @Override
    public double area(){
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - b));
    }
}
