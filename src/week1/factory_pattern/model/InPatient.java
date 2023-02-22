package week1.factory_pattern.model;

public class InPatient extends Patient {
    public InPatient(String name, String id) {
        super(name, id);
    }

    @Override
    public void getInfo() {
        System.out.println("This is an InPatient: " + name + ", ID: " + id);
    }
}
