package edu.austral.ingsis.math.composite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Variable implements OneArgumentFunction{
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public double solve(VariableContext variableCpnrext) { //Aca le tendría que pasar un mapa con el valor de cada variable y que en caso de ser una variable lo use
        return variableCpnrext.getVariable(name);
    }

    @Override
    public double solve() {
        return solve(new VariableContext());
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
