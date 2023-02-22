package week1.bridge_pattern.model;

public class InPatient implements Patient {
    private int id;
    private String name;

    public InPatient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getPatientId() {
        return id;
    }

    @Override
    public String getPatientName() {
        return name;
    }
}

