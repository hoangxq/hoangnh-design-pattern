package week3.proxy_pattern.model;

import week3.proxy_pattern.exception.AuthorizationException;

public class Doctor implements Prescription {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public static boolean checkDoctorAuthorization() {
        return true;
    }

    @Override
    public void writePrescription(Patient patient, Medicine medicine) throws AuthorizationException {
        Prescription prescription = new PrescriptionProxy();
        prescription.writePrescription(patient, medicine);
    }
}
