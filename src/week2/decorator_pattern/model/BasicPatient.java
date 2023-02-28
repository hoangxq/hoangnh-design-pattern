package week2.decorator_pattern.model;

// Lớp bệnh nhân cơ bản
public class BasicPatient implements Patient {
    private String name;
    private String gender;
    private int age;

    public BasicPatient(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
