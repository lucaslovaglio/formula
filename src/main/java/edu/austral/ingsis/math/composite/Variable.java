package edu.austral.ingsis.math.composite;

import java.util.ArrayList;

public class Variable implements Function{
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public double solve() { //Aca le tendría que pasar un mapa con el valor de cada variable y que en caso de ser una variable lo use
        return 0;
    }

    @Override
    public ArrayList<String> getVariables() {
        return new ArrayList<>() {{
            add(name);
        }};
    }

    @Override
    public String print() {
        return name;
    }
}
