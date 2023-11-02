package edu.austral.ingsis.math.composite;

import java.util.ArrayList;

public interface Function {
    double solve();
    ArrayList<String> getVariables();
    String print();
}
