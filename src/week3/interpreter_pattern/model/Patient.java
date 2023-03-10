package week3.interpreter_pattern.model;

public class Patient {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String disease;
    private String medicalHistory;

    public Patient(String name, int age, String gender, String address, String disease, String medicalHistory) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.disease = disease;
        this.medicalHistory = medicalHistory;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}