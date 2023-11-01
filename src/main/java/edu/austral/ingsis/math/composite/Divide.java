package edu.austral.ingsis.math.composite;

public class Divide implements Function{
    private final Function numeral;
    private final Function denominator;

    public Divide(Function numeral, Function denominator) {
        this.numeral = numeral;
        this.denominator = denominator;
    }

    @Override
    public double solve() {
        return numeral.solve() / denominator.solve();
    }
}
