package week2.filter_pattern.filter;

import week2.filter_pattern.model.Patient;

import java.util.ArrayList;
import java.util.List;

public class DiseaseFilter implements PatientFilter{
    private String disease;

    public DiseaseFilter(String disease) {
        this.disease = disease;
    }

    @Override
    public List<Patient> filter(List<Patient> patients) {
        List<Patient> filteredPatients = new ArrayList<Patient>();

        for (Patient patient : patients) {
            if (patient.getDisease().equals(disease)) {
                filteredPatients.add(patient);
            }
        }

        return filteredPatients;
    }
}
