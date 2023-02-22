package week1.singleton_pattern.model;

public abstract class Patient {
    protected String name;
    protected String id;

    public Patient(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract void getInfo();
}


