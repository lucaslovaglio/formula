package edu.austral.ingsis.math.composite;

public class Multiply implements Function{
    private final Function left;
    private final Function right;

    public Multiply(Function left, Function right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double solve() {
        return left.solve() * right.solve();
    }
}
