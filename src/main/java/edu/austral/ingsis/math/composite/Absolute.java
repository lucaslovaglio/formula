package edu.austral.ingsis.math.composite;

import edu.austral.ingsis.math.visitor.VariableContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Absolute implements Function{
    private final Function base;

    public Absolute(Function base) {
        this.base = base;
    }

    @Override
    public double solve(VariableContext variablesContext) {
        return Math.abs(base.solve(variablesContext));
    }

    @Override
    public double solve() {
        return solve(new VariableContext());
    }

    @Override
    public ArrayList<String> getVariables() {
        return new ArrayList<>() {{
            addAll(base.getVariables());
        }};
    }

    @Override
    public String print() {
        return "|" + base.print() + "|" ;
    }
}
