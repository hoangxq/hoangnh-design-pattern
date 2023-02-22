package week1.bridge_pattern.model;

public class PatientInformationDisplayWithId extends PatientInformationDisplay{
    public PatientInformationDisplayWithId(Patient patient) {
        super(patient);
    }

    @Override
    public void display() {
        System.out.println("Patient ID: " + patient.getPatientId());
        System.out.println("Patient name: " + patient.getPatientName());
    }
}
