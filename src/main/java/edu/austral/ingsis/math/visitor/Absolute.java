package edu.austral.ingsis.math.visitor;

import edu.austral.ingsis.math.visitor.Visitor;

public class Absolute implements OneArgumentFunction{
    private final Function base;

    public Absolute(Function base) {
        this.base = base;
    }

    public Function getBase() {
        return base;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
