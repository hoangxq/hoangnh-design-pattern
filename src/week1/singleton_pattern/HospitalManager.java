package week1.singleton_pattern;

import week1.singleton_pattern.model.Employee;
import week1.singleton_pattern.model.Patient;

import java.util.ArrayList;
import java.util.List;

public class HospitalManager {
    private static HospitalManager instance;
    private String name;
    private String address;
    private List<Patient> patients;
    private List<Employee> employees;

    private HospitalManager() {
        name = "ABC Hospital";
        address = "123 Street";
        patients = new ArrayList<>();
        employees = new ArrayList<>();
    }

    public static HospitalManager getInstance() {
        if (instance == null) {
            instance = new HospitalManager();
        }
        return instance;
    }

    public void addPatient(Patient patient){
        patients.add(patient);
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
}

