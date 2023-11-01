package edu.austral.ingsis.math.visitor;

import edu.austral.ingsis.math.visitor.Visitor;

public class SquareRoot implements Function{
    private final Function radical;

    public SquareRoot(Function radical) {
        this.radical = radical;
    }

    public Function getRadical() {
        return radical;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
