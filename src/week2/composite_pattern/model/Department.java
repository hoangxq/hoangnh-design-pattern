package week2.composite_pattern.model;

import java.util.ArrayList;
import java.util.List;

public class Department implements HospitalUnit {
    private String name;
    private List<HospitalUnit> hospitalUnits = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void assign(HospitalUnit hospitalUnit) {
        hospitalUnits.add(hospitalUnit);
    }

    @Override
    public void remove(HospitalUnit hospitalUnit) {
        hospitalUnits.remove(hospitalUnit);
    }

    @Override
    public List<HospitalUnit> getSubordinates() {
        return hospitalUnits;
    }
}