package week3.model;

public class PatientRecord {
    private Patient patient;
    private String appointmentDate;
    private String medicalTestResult;
    private double paymentAmount;

    public PatientRecord(Patient patient, String appointmentDate, String medicalTestResult, double paymentAmount) {
        this.patient = patient;
        this.appointmentDate = appointmentDate;
        this.medicalTestResult = medicalTestResult;
        this.paymentAmount = paymentAmount;
    }
}
