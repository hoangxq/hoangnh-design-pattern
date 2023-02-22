package week1.singleton_pattern;

import week1.singleton_pattern.model.Doctor;
import week1.singleton_pattern.model.InPatient;

public class Main {
    public static void main(String[] args) {
        HospitalManager manager = HospitalManager.getInstance();
        manager.addPatient(new InPatient("John", "123"));
        manager.addEmployee(new Doctor("Mary", "456"));
    }
}
