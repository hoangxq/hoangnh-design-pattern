package week1.singleton_pattern.model;

public class Doctor extends Employee {
    public Doctor(String name, String id) {
        super(name, id);
    }

    @Override
    public void getInfo() {
        System.out.println("This is a Doctor: " + name + ", ID: " + id);
    }
}
