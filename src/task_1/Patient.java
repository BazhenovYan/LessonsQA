package task_1;

public class Patient {
    public int planToHeal;
    public Doctor doctor;
    public Patient(int planToHeal){
        this.planToHeal = planToHeal;
    }
    public int getPlanHeal() {
        return planToHeal;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}

