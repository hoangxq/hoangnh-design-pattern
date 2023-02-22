package week1.builder_pattern.model;

public class Patient {
    private String name;
    private int age;
    private String gender;
    private String medicalRecord;

    private Patient(PatientBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.medicalRecord = builder.medicalRecord;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", medicalRecord='" + medicalRecord + '\'' +
                '}';
    }

    public static class PatientBuilder {
        private String name;
        private int age;
        private String gender;
        private String medicalRecord;

        public PatientBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PatientBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PatientBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public PatientBuilder setMedicalRecord(String medicalRecord) {
            this.medicalRecord = medicalRecord;
            return this;
        }

        public Patient build() {
            return new Patient(this);
        }
    }
}

