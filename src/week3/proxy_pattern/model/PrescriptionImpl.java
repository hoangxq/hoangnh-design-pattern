package week3.proxy_pattern.model;

import java.util.ArrayList;
import java.util.List;

public class PrescriptionImpl implements Prescription {
    private List<Prescription> prescriptionList = new ArrayList<>();

    public PrescriptionImpl(Patient patient, Medicine medicine) {
    }

    public PrescriptionImpl() {
    }

    @Override
    public void writePrescription(Patient patient, Medicine medicine) {
        prescriptionList.add(new PrescriptionImpl(patient, medicine));
    }
}