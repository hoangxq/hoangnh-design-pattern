package week1.adapter_pattern.model;

public class HospitalEHR implements ElectronicHealthRecord {
    @Override
    public String getPatientName() {
        return "John";
    }

    @Override
    public int getPatientAge() {
        return 35;
    }
}
