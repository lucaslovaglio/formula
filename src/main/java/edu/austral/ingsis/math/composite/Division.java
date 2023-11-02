package edu.austral.ingsis.math.composite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Division implements Function{
    private final Function numeral;
    private final Function denominator;

    public Division(Function numeral, Function denominator) {
        this.numeral = numeral;
        this.denominator = denominator;
    }

    @Override
    public double solve(VariableContext variablesContext) {
        return numeral.solve(variablesContext) / denominator.solve(variablesContext);
    }

    @Override
    public double solve() {
        return solve(new VariableContext());
    }

    @Override
    public ArrayList<String> getVariables() {
        return new ArrayList<>() {{
            addAll(numeral.getVariables());
            addAll(denominator.getVariables());
        }};
    }

    @Override
    public String print() {
        return Formater.formatFunction(numeral) + " / " + Formater.formatFunction(denominator);
    }
}
