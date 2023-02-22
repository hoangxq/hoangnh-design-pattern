package week2.composite_pattern.model;

import java.util.List;

public interface HospitalUnit {
    void assign(HospitalUnit hospitalUnit);
    void remove(HospitalUnit hospitalUnit);
    List<HospitalUnit> getSubordinates();
}
