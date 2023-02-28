package week2.decorator_pattern.decorator;

import week2.decorator_pattern.model.Patient;

// Lớp Decorator bổ sung tính năng thông tin bệnh tật
public class SicknessDecorator implements Patient {
    private Patient patient;
    private String sickness;

    public SicknessDecorator(Patient patient, String sickness) {
        this.patient = patient;
        this.sickness = sickness;
    }

    public String getName() {
        return patient.getName();
    }

    public String getGender() {
        return patient.getGender();
    }

    public int getAge() {
        return patient.getAge();
    }

    public String getSickness() {
        return sickness;
    }
}
