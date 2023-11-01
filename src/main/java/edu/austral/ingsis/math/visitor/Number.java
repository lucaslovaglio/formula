package edu.austral.ingsis.math.visitor;

import edu.austral.ingsis.math.visitor.Visitor;

public class Number implements OneArgumentFunction {
    private final double value;

    public Number(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
