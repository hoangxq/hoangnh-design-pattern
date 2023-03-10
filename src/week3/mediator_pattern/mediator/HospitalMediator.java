package week3.mediator_pattern.mediator;

import week3.mediator_pattern.model.*;

public class HospitalMediator implements Mediator {
    private Patient patient;
    private Doctor doctor;
    private ExaminationRoom examinationRoom;
    private EmergencyRoom emergencyRoom;

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void send(String message, Colleague colleague) {
        if (colleague == patient) {
            doctor.receive(message);
            examinationRoom.receive(message);
            emergencyRoom.receive(message);
        } else if (colleague == doctor) {
            patient.receive(message);
            examinationRoom.receive(message);
            emergencyRoom.receive(message);
        } else if (colleague == examinationRoom) {
            patient.receive(message);
            doctor.receive(message);
            emergencyRoom.receive(message);
        } else if (colleague == emergencyRoom) {
            patient.receive(message);
            doctor.receive(message);
            examinationRoom.receive(message);
        }
    }
}
