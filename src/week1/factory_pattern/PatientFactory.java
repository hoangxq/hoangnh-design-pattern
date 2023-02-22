package week1.factory_pattern;

import week1.factory_pattern.model.HomePatient;
import week1.factory_pattern.model.InPatient;
import week1.factory_pattern.model.OutPatient;
import week1.factory_pattern.model.Patient;

public class PatientFactory {
    public Patient createPatient(String type, String name, String id) {
        if(type.equalsIgnoreCase("InPatient")) {
            return new InPatient(name, id);
        }
        else if(type.equalsIgnoreCase("OutPatient")) {
            return new OutPatient(name, id);
        }
        else if(type.equalsIgnoreCase("HomePatient")) {
            return new HomePatient(name, id);
        }
        else {
            return null;
        }
    }
}

