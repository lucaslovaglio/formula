package edu.austral.ingsis.math.composite;

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
}
