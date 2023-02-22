package week1.prototype_pattern.model;

public abstract class Patient implements Cloneable {
    private String name;
    private int age;
    private String gender;
    private String medicalRecord;

    public Patient(String name, int age, String gender, String medicalRecord) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.medicalRecord = medicalRecord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    @Override
    public Patient clone() throws CloneNotSupportedException {
        return (Patient) super.clone();
    }
}

