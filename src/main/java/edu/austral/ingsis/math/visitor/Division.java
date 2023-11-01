package edu.austral.ingsis.math.visitor;

import edu.austral.ingsis.math.visitor.Visitor;

public class Division implements Function{
    private final Function numeral;
    private final Function denominator;

    public Division(Function numeral, Function denominator) {
        this.numeral = numeral;
        this.denominator = denominator;
    }

    public Function getNumeral() {
        return numeral;
    }

    public Function getDenominator() {
        return denominator;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
