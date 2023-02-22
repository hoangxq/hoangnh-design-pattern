package week1.prototype_pattern.model;

public class InPatient extends Patient {
    private String roomNumber;

    public InPatient(String name, int age, String gender, String medicalRecord, String roomNumber) {
        super(name, age, gender, medicalRecord);
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
