package week3.interpreter_pattern.expression;

import week3.interpreter_pattern.model.Patient;

public class AgeExpression implements Expression {
    private int minAge;

    public AgeExpression(int minAge) {
        this.minAge = minAge;
    }

    @Override
    public boolean interpret(Patient patient) {
        return patient.getAge() >= minAge;
    }
}