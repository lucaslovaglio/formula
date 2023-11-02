package edu.austral.ingsis.math.composite;

public class Formater {
    public static String formatFunction(Function function) {
        if (!(function instanceof OneArgumentFunction)) {
            return "(" + function.print() + ")";
        }
        return function.print();
    }
}
