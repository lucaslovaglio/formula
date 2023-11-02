package edu.austral.ingsis.math.composite;

import java.util.ArrayList;
import java.util.Map;

public interface Function {
    double solve(VariableContext variablesContext);
    double solve();
    ArrayList<String> getVariables();
    String print();
}
