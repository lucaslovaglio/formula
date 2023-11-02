package edu.austral.ingsis.math.composite;

import java.util.ArrayList;

public class Number implements Function{
    private final double value;

    public Number(double value) {
        this.value = value;
    }

    @Override
    public double solve() {
        return value;
    }

    @Override
    public ArrayList<String> getVariables() {
        return new ArrayList<>();
    }

    @Override
    public String print() {
        return String.valueOf(value);
    }
}
