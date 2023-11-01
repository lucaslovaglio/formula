package edu.austral.ingsis.math.composite;

public class Substract implements Function{
    private final Function left;
    private final Function right;

    public Substract(Function left, Function right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double solve() {
        return left.solve() - right.solve();
    }
}
