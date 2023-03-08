package week2.facade_pattern;

import week2.facade_pattern.model.Doctor;
import week2.facade_pattern.model.Equipment;
import week2.facade_pattern.model.Medicine;
import week2.facade_pattern.model.Nurse;

public class HospitalSystem {
    private Doctor doctor;
    private Nurse nurse;
    private Equipment equipment;
    private Medicine medicine;

    public HospitalSystem() {
        doctor = new Doctor();
        nurse = new Nurse();
        equipment = new Equipment();
        medicine = new Medicine();
    }

    public void treatPatient() {
        doctor.diagnose();
        nurse.prepareForTreatment();
        equipment.prepareForTreatment();
        medicine.prepareForTreatment();
        doctor.treat();
        nurse.finishTreatment();
        equipment.finishTreatment();
        medicine.finishTreatment();
    }
}









