package week1.factory_pattern.model;

public class HomePatient extends Patient {
    public HomePatient(String name, String id) {
        super(name, id);
    }

    @Override
    public void getInfo() {
        System.out.println("This is a HomePatient: " + name + ", ID: " + id);
    }
}
