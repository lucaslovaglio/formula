package edu.austral.ingsis.math.composite;

import edu.austral.ingsis.math.visitor.VariableContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Power implements Function{
    private final Function base;
    private final Function exponent;

    public Power(Function base, Function exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    @Override
    public double solve(VariableContext variablesContext) {
        return Math.pow(base.solve(variablesContext), exponent.solve(variablesContext));
    }

    @Override
    public double solve() {
        return solve(new VariableContext());
    }

    @Override
    public ArrayList<String> getVariables() {
        return new ArrayList<>() {{
            addAll(base.getVariables());
            addAll(exponent.getVariables());
        }};
    }

    @Override
    public String print() {
        return base.print() + " ^ " + exponent.print();
    }
}
