package edu.austral.ingsis.math.composite;

public class Variable implements Function{
    private final String name;
    private final double value;

    public Variable(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public double solve() { //Aca le tendría que pasar un mapa con el valor de cada variable y que en caso de ser una variable lo use
        return value;
    }
}
