package week1.factory_pattern.model;

public class OutPatient extends Patient {
    public OutPatient(String name, String id) {
        super(name, id);
    }

    @Override
    public void getInfo() {
        System.out.println("This is an OutPatient: " + name + ", ID: " + id);
    }
}
