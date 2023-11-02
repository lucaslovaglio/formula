package edu.austral.ingsis.math.composite;

import java.util.HashMap;
import java.util.Map;

public class VariableContext {
    private final Map<String, Double> variables = new HashMap<>();

    public void setVariable(String name, Double value) {
        variables.put(name, value);
    }

    public Double getVariable(String name) {
        return variables.get(name);
    }
}
