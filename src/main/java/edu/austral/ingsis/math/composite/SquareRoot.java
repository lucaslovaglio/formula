package edu.austral.ingsis.math.composite;

import java.util.ArrayList;

public class SquareRoot implements Function{
    private final Function radical;

    public SquareRoot(Function radical) {
        this.radical = radical;
    }

    @Override
    public double solve() {
        return Math.sqrt(radical.solve());
    }

    @Override
    public ArrayList<String> getVariables() {
        return new ArrayList<>() {{
            addAll(radical.getVariables());
        }};
    }

    @Override
    public String print() {
        return "√" + radical.print();
    }
}
