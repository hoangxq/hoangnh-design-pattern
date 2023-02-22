package week1.bridge_pattern;

import week1.bridge_pattern.model.InPatient;
import week1.bridge_pattern.model.Patient;
import week1.bridge_pattern.model.PatientInformationDisplayWithId;

public class Main {
    public static void main(String[] args) {
        Patient patient = new InPatient(123, "John Doe");
        PatientInformationDisplayWithId displayWithId = new PatientInformationDisplayWithId(patient);
        displayWithId.display();
    }
}
