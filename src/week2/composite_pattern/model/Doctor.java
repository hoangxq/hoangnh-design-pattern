package week2.composite_pattern.model;

import java.util.ArrayList;
import java.util.List;

public class Doctor implements HospitalUnit {
    private String name;
    private List<HospitalUnit> hospitalUnits = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
    }

    public void assign(HospitalUnit hospitalUnit) {
        hospitalUnits.add(hospitalUnit);
    }

    public void remove(HospitalUnit hospitalUnit) {
        hospitalUnit.remove(hospitalUnit);
    }

    public List<HospitalUnit> getSubordinates() {
        return hospitalUnits;
    }
}
