package week1.bridge_pattern.model;

public class PatientInformationDisplayName extends PatientInformationDisplay {
    public PatientInformationDisplayName(Patient patient) {
        super(patient);
    }

    @Override
    public void display() {
        System.out.println("Patient name: " + patient.getPatientName());
    }
}

