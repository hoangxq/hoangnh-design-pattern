package week3.interpreter_pattern;

import week3.interpreter_pattern.expression.AgeExpression;
import week3.interpreter_pattern.expression.AndExpression;
import week3.interpreter_pattern.expression.DiseaseExpression;
import week3.interpreter_pattern.expression.Expression;
import week3.interpreter_pattern.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<Patient>();
        PatientSearchContext context = new PatientSearchContext(patients);

        Expression ageExpr = new AgeExpression(30);
        Expression diseaseExpr = new DiseaseExpression("cancer");

        Expression andExpr = new AndExpression(ageExpr, diseaseExpr);
        List<Patient> result = context.search(andExpr);
    }
}
