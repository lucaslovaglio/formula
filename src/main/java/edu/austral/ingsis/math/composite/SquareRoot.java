package edu.austral.ingsis.math.composite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SquareRoot implements OneArgumentFunction{
    private final Function radical;

    public SquareRoot(Function radical) {
        this.radical = radical;
    }

    @Override
    public double solve(VariableContext variablesContext) {
        return Math.sqrt(radical.solve(variablesContext));
    }

    @Override
    public double solve() {
        return solve(new VariableContext());
    }

    @Override
    public ArrayList<String> getVariables() {
        return new ArrayList<>() {{
            addAll(radical.getVariables());
        }};
    }

    @Override
    public String print() {
        return "√" + Formater.formatFunction(radical);
    }
}
