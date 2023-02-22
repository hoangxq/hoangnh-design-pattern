package week1.bridge_pattern.model;

public abstract class PatientInformationDisplay {
    protected Patient patient;

    public PatientInformationDisplay(Patient patient) {
        this.patient = patient;
    }

    public abstract void display();
}

