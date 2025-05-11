package task_1;

public class Therapist implements Doctor {
    @Override
    public String heal() {
        return "проводит обследование";
    }
    public String toString() { // переопределил, чтобы в дальнейшем правильно выводилось
        return "Терапевт";
    }
    public void putHeal(Patient patient){
        int planToHeal = patient.getPlanHeal();
        Doctor doctor;
        // условия выбора лечения и врача
        if (planToHeal == 1) {
            doctor = new Hirurg();
            patient.setDoctor(doctor);
            doctor.heal();
            System.out.println("Назначен врач: " + doctor + "\nи он: " + doctor.heal());
        } else if (planToHeal == 2) {
            doctor = new Dentist();
            patient.setDoctor(doctor);
            doctor.heal();
            System.out.println("Назначен врач: " + doctor + "\nи он: " + doctor.heal());
        } else {
            doctor = this;
            patient.setDoctor(doctor);
            doctor.heal();
            System.out.println("Назначен врач: " + doctor + "\nи он: " + doctor.heal());
        }
    }
}
