package edu.austral.ingsis.math.composite;

public class Module implements Function{
    private final Function base;

    public Module(Function base) {
        this.base = base;
    }

    @Override
    public double solve() {
        return Math.abs(base.solve());
    }
}
