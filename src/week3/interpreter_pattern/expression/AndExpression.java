package week3.interpreter_pattern.expression;

import week3.interpreter_pattern.model.Patient;

public class AndExpression implements Expression {
    private Expression expr1;
    private Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(Patient patient) {
        return expr1.interpret(patient) && expr2.interpret(patient);
    }
}