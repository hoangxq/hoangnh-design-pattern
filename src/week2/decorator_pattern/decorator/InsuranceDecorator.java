package week2.decorator_pattern.decorator;

import week2.decorator_pattern.model.Patient;

// Lớp Decorator bổ sung tính năng thông tin bảo hiểm y tế
public class InsuranceDecorator implements Patient {
    private Patient patient;
    private String insuranceNumber;

    public InsuranceDecorator(Patient patient, String insuranceNumber) {
        this.patient = patient;
        this.insuranceNumber = insuranceNumber;
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

    public String getInsuranceNumber() {
        return insuranceNumber;
    }
}
