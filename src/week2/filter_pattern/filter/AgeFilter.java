package week2.filter_pattern.filter;

import week2.filter_pattern.model.Patient;

import java.util.ArrayList;
import java.util.List;

public class AgeFilter implements PatientFilter {
    private int minAge;
    private int maxAge;

    public AgeFilter(int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    @Override
    public List<Patient> filter(List<Patient> patients) {
        List<Patient> filteredPatients = new ArrayList<Patient>();

        for (Patient patient : patients) {
            if (patient.getAge() >= minAge && patient.getAge() <= maxAge) {
                filteredPatients.add(patient);
            }
        }

        return filteredPatients;
    }
}

