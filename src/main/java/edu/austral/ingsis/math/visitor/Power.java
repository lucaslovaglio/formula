package edu.austral.ingsis.math.visitor;

import edu.austral.ingsis.math.visitor.Visitor;

public class Power implements Function{
    private final Function base;
    private final Function exponent;

    public Power(Function base, Function exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    public Function getBase() {
        return base;
    }

    public Function getExponent() {
        return exponent;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
