package week3.interpreter_pattern.expression;

import week3.interpreter_pattern.model.Patient;

public class DiseaseExpression implements Expression {
    private String disease;

    public DiseaseExpression(String disease) {
        this.disease = disease;
    }

    @Override
    public boolean interpret(Patient patient) {
        return patient.getDisease().equalsIgnoreCase(disease);
    }
}
