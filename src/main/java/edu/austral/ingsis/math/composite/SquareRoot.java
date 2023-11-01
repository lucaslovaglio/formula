package edu.austral.ingsis.math.composite;

public class SquareRoot implements Function{
    private final Function radical;

    public SquareRoot(Function radical) {
        this.radical = radical;
    }

    @Override
    public double solve() {
        return Math.sqrt(radical.solve());
    }
}
