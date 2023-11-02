package edu.austral.ingsis.math.composite;

import java.util.ArrayList;

public class Absolute implements Function{
    private final Function base;

    public Absolute(Function base) {
        this.base = base;
    }

    @Override
    public double solve() {
        return Math.abs(base.solve());
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
