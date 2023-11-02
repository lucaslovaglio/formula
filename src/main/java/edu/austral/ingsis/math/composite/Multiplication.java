package edu.austral.ingsis.math.composite;

import java.util.ArrayList;

public class Multiplication implements Function{
    private final Function left;
    private final Function right;

    public Multiplication(Function left, Function right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double solve() {
        return left.solve() * right.solve();
    }

    @Override
    public ArrayList<String> getVariables() {
        return new ArrayList<>() {{
            addAll(left.getVariables());
            addAll(right.getVariables());
        }};
    }

    @Override
    public String print() {
        return left.print() + " * " + right.print();
    }
}
