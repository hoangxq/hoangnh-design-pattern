package week1.adapter_pattern.adapter;

import week1.adapter_pattern.model.ElectronicHealthRecord;
import week1.adapter_pattern.model.Patient;

public class PatientAdapter implements ElectronicHealthRecord {
    private Patient patient;

    public PatientAdapter(Patient patient) {
        this.patient = patient;
    }

    public String getPatientName() {
        return patient.getName();
    }

    public int getPatientAge() {
        return patient.getAge();
    }
}

