package week3.command_pattern;

import week3.command_pattern.model.Hospital;
import week3.command_pattern.model.Patient;

public class CreatePatientCommand implements Command {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String reasonForVisit;
    private String medicalHistory;

    public CreatePatientCommand(String name, int age, String gender, String address, String reasonForVisit, String medicalHistory) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.reasonForVisit = reasonForVisit;
        this.medicalHistory = medicalHistory;
    }

    @Override
    public void execute() {
        Patient patient = new Patient(name, age, gender, address, reasonForVisit, medicalHistory);
        Hospital.addPatient(patient);
    }
}
