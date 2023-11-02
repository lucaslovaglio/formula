package edu.austral.ingsis.math.composite;

import java.util.ArrayList;

public class Power implements Function{
    private final Function base;
    private final Function exponent;

    public Power(Function base, Function exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    @Override
    public double solve() {
        return Math.pow(base.solve(), exponent.solve());
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
