package week1.prototype_pattern;

import week1.prototype_pattern.model.InPatient;
import week1.prototype_pattern.model.Patient;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Patient patientPrototype = new InPatient("John", 35, "Male", "Cardiac arrest", "101");

        Patient patient1 = patientPrototype.clone();
        patient1.setName("Fury");
        patient1.setMedicalRecord("Appendicitis");

        Patient patient2 = patientPrototype.clone();
        patient2.setName("Bob");
        patient2.setMedicalRecord("Fractured leg");

    }
}
