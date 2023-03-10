package week3.interpreter_pattern.expression;

import week3.interpreter_pattern.model.Patient;

public interface Expression {
    boolean interpret(Patient patient);
}