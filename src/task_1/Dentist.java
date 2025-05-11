package task_1;

public class Dentist implements Doctor {
    @Override
    public String heal() {
        return "Лечит зубы";
    }
    public String toString() {
        return "Стоматолог";
    }
}
