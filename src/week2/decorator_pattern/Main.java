package week2.decorator_pattern;

import week2.decorator_pattern.decorator.InsuranceDecorator;
import week2.decorator_pattern.decorator.SicknessDecorator;
import week2.decorator_pattern.model.BasicPatient;
import week2.decorator_pattern.model.Patient;

public class Main {
    public static void main(String[] args) {
        Patient patient = new BasicPatient("John", "Male", 30);

        patient = new SicknessDecorator(patient, "Flu");

        patient = new InsuranceDecorator(patient, "123456789");

        System.out.println(patient.getName());
        System.out.println(patient.getGender());
        System.out.println(patient.getAge());
        System.out.println(((SicknessDecorator) patient).getSickness());
        System.out.println(((InsuranceDecorator) patient).getInsuranceNumber());
    }
}
