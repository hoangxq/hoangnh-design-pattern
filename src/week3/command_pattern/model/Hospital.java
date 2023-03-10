package week3.command_pattern.model;

import week3.command_pattern.Command;
import week3.command_pattern.CreatePatientCommand;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private static List<Patient> patients = new ArrayList<Patient>();

    public static void addPatient(Patient patient) {
        patients.add(patient);
    }

    public static void createPatient(String name, int age, String gender, String address, String reasonForVisit, String medicalHistory) {
        Command createPatientCommand = new CreatePatientCommand(name, age, gender, address, reasonForVisit, medicalHistory);
        createPatientCommand.execute();
    }
}