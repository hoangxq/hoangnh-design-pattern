package week1.adapter_pattern;

import week1.adapter_pattern.adapter.PatientAdapter;
import week1.adapter_pattern.model.ElectronicHealthRecord;
import week1.adapter_pattern.model.Patient;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("John", 35);
        ElectronicHealthRecord ehr = new PatientAdapter(patient);
        System.out.println("Patient name: " + ehr.getPatientName());
        System.out.println("Patient age: " + ehr.getPatientAge());
    }
}
