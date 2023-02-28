package week2.filter_pattern.filter;

import week2.filter_pattern.model.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientFilterChain {
    private List<PatientFilter> filters;

    public PatientFilterChain() {
        this.filters = new ArrayList<PatientFilter>();
    }

    public void addFilter(PatientFilter filter) {
        filters.add(filter);
    }

    public List<Patient> filter(List<Patient> patients) {
        for (PatientFilter filter : filters) {
            patients = filter.filter(patients);
        }

        return patients;
    }
}

