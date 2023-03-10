package week3.iterator_pattern.iterator;

import week3.iterator_pattern.model.Patient;

public class PatientIterator implements Iterator {
    private Patient[] patients;
    private int position = 0;

    public PatientIterator(Patient[] patients) {
        this.patients = patients;
    }

    public boolean hasNext() {
        if (position >= patients.length || patients[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        Patient patient = patients[position];
        position++;
        return patient;
    }
}