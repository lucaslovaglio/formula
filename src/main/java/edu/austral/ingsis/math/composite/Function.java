package edu.austral.ingsis.math.composite;

import edu.austral.ingsis.math.visitor.VariableContext;

import java.util.ArrayList;
import java.util.Map;

public interface Function {
    double solve(VariableContext variablesContext);
    double solve();
    ArrayList<String> getVariables();
    String print();
}
