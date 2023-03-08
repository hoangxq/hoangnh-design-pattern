package week3.proxy_pattern.model;

import week3.proxy_pattern.exception.AuthorizationException;

public interface Prescription {
    void writePrescription(Patient patient, Medicine medicine) throws AuthorizationException;
}







