package edu.austral.ingsis.math.composite;

import java.util.ArrayList;

public class Division implements Function{
    private final Function numeral;
    private final Function denominator;

    public Division(Function numeral, Function denominator) {
        this.numeral = numeral;
        this.denominator = denominator;
    }

    @Override
    public double solve() {
        return numeral.solve() / denominator.solve();
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
        return numeral.print() + " / " + denominator.print();
    }
}
