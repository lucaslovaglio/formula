package edu.austral.ingsis.math.visitor;

public interface Visitor<T> {
    T visit(Addition addition);
    T visit(Division division);
    T visit(Multiplication multiplication);
    T visit(Subtraction subtraction);
    T visit(Number number);

    T visit(Absolute absolute);

    T visit(Power power);

    T visit(SquareRoot squareRoot);

    T visit(Variable variable);
}
