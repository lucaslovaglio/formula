package edu.austral.ingsis.math.composite;

public class Add implements Function{
    private final Function left;
    private final Function right;

    public Add(Function left, Function right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double solve() {
        return left.solve() + right.solve();
    }
}
