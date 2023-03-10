package week3.command_pattern.model;

public class Patient {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String reasonForVisit;
    private String medicalHistory;

    public Patient(String name, int age, String gender, String address, String reasonForVisit, String medicalHistory) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.reasonForVisit = reasonForVisit;
        this.medicalHistory = medicalHistory;
    }
}