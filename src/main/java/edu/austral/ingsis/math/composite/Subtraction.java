package edu.austral.ingsis.math.composite;

import edu.austral.ingsis.math.visitor.VariableContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Subtraction implements Function{
    private final Function left;
    private final Function right;

    public Subtraction(Function left, Function right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double solve(VariableContext variablesContext) {
        return left.solve(variablesContext) - right.solve(variablesContext);
    }

    @Override
    public double solve() {
        return solve(new VariableContext());
    }

    @Override
    public ArrayList<String> getVariables() {
        return new ArrayList<>() {{
            addAll(left.getVariables());
            addAll(right.getVariables());
        }};
    }

    @Override
    public String print() {
        return left.print() + " - " + right.print();
    }
}
