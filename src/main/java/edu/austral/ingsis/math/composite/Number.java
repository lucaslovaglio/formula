package edu.austral.ingsis.math.composite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Number implements OneArgumentFunction{
    private final double value;

    public Number(double value) {
        this.value = value;
    }

    @Override
    public double solve(VariableContext variablesContext) {
        return value;
    }

    @Override
    public double solve() {
        return solve(new VariableContext());
    }

    @Override
    public ArrayList<String> getVariables() {
        return new ArrayList<>();
    }

    @Override
    public String print() {
        if (value % 1 == 0)
            return String.valueOf((int) value);
        return String.valueOf(value);
    }
}
