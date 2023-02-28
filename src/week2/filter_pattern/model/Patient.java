package week2.filter_pattern.model;

public class Patient {
    private String name;
    private int age;
    private String disease;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }
}
