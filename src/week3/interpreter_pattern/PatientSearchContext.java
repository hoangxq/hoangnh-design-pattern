package week3.interpreter_pattern;

import week3.interpreter_pattern.expression.Expression;
import week3.interpreter_pattern.model.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientSearchContext {
    private List<Patient> patients;

    public PatientSearchContext(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Patient> search(Expression expression) {
        List<Patient> result = new ArrayList<>();
        for (Patient patient : patients) {
            if (expression.interpret(patient)) {
                result.add(patient);
            }
        }
        return result;
    }
}
