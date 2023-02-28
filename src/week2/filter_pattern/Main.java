package week2.filter_pattern;

import week2.filter_pattern.filter.AgeFilter;
import week2.filter_pattern.filter.DiseaseFilter;
import week2.filter_pattern.filter.PatientFilterChain;
import week2.filter_pattern.model.Patient;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        PatientFilterChain filterChain = new PatientFilterChain();
        filterChain.addFilter(new AgeFilter(18, 60));
        filterChain.addFilter(new DiseaseFilter("None"));

        List<Patient> filteredPatients = filterChain.filter(patients);

    }
}
