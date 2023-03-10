package week3.iterator_pattern;

import week3.iterator_pattern.iterator.Iterator;
import week3.iterator_pattern.model.Patient;
import week3.iterator_pattern.model.PatientCollection;

public class Main {
    public static void main(String[] args) {
        Patient[] patients = new Patient[3];
        patients[0] = new Patient("John", 25, "P001");
        patients[1] = new Patient("Jane", 30, "P002");
        patients[2] = new Patient("Bob", 40, "P003");

        PatientCollection collection = new PatientCollection(patients);
        Iterator iterator = collection.createIterator();
        while (iterator.hasNext()) {
            Patient patient = (Patient)iterator.next();
            System.out.println(patient.getName());
        }
    }
}
