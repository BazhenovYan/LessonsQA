package task_1;

public class Hirurg implements Doctor {
    @Override
    public String heal() {
        return "оперирует";
    }
    public String toString() {
        return "Хирург";
    }
}
