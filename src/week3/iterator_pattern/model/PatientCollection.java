package week3.iterator_pattern.model;

import week3.iterator_pattern.iterator.Iterator;
import week3.iterator_pattern.iterator.PatientIterator;

public class PatientCollection {
    private Patient[] patients;

    public PatientCollection(Patient[] patients) {
        this.patients = patients;
    }

    public Iterator createIterator() {
        return new PatientIterator(patients);
    }
}