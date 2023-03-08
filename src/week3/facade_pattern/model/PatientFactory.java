package week3.facade_pattern.model;

import java.util.HashMap;
import java.util.Map;

public class PatientFactory {
    private static Map<String, Patient> patientMap = new HashMap<>();

    public static Patient getPatient(String name, int age, String address, String phoneNumber) {
        String key = name + "_" + age + "_" + address + "_" + phoneNumber;
        if (patientMap.containsKey(key)) {
            return patientMap.get(key);
        } else {
            Patient patient = new Patient(name, age, address, phoneNumber);
            patientMap.put(key, patient);
            return patient;
        }
    }
}
