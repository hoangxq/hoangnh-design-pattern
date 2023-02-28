package week2.filter_pattern.filter;

import week2.filter_pattern.model.Patient;

import java.util.List;

public interface PatientFilter {
    List<Patient> filter(List<Patient> patients);
}
