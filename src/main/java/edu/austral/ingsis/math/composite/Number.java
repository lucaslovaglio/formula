package edu.austral.ingsis.math.composite;

public class Number implements Function{
    private final double value;

    public Number(double value) {
        this.value = value;
    }

    @Override
    public double solve() {
        return value;
    }
}
