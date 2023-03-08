package week3.proxy_pattern.model;

import week3.proxy_pattern.exception.AuthorizationException;

public class PrescriptionProxy implements Prescription {
    private Prescription prescription;

    @Override
    public void writePrescription(Patient patient, Medicine medicine) throws AuthorizationException {
        if (Doctor.checkDoctorAuthorization()) {
            if (prescription == null) {
                prescription = new PrescriptionImpl();
            }
            prescription.writePrescription(patient, medicine);
        } else {
            throw new AuthorizationException("You are not authorized to write prescription.");
        }
    }
}
