package week1.factory_pattern;

import week1.factory_pattern.model.Patient;

public class Main {
    public static void main(String[] args) {
        PatientFactory patientFactory = new PatientFactory();

        Patient inPatient = patientFactory.createPatient("InPatient", "Patient 1", "212323");
        inPatient.getInfo();

        Patient outPatient = patientFactory.createPatient("outPatient", "Patient 2", "524323");
        outPatient.getInfo();

        Patient homePatient = patientFactory.createPatient("homePatient", "Patient 3", "4111212");
        homePatient.getInfo();

    }
}
