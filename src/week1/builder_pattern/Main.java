package week1.builder_pattern;

import week1.builder_pattern.model.Patient;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient.PatientBuilder()
                .setName("John")
                .setAge(23)
                .setGender("Male")
                .setMedicalRecord("High blood pressure")
                .build();
        System.out.println(patient);
    }
}
