package edu.austral.ingsis.math.visitor;

import java.util.ArrayList;
import java.util.List;

public class VariableListVisitor implements Visitor<List<String>> {

    @Override
    public List<String> visit(Addition addition) {
        VariableListVisitor variableListVisitor = this;
        return new ArrayList<>() {{
            addAll(addition.getLeft().accept(variableListVisitor));
            addAll(addition.getRight().accept(variableListVisitor));
        }};
    }

    @Override
    public List<String> visit(Division division) {
        VariableListVisitor variableListVisitor = this;
        return new ArrayList<>() {{
            addAll(division.getNumeral().accept(variableListVisitor));
            addAll(division.getDenominator().accept(variableListVisitor));
        }};
    }

    @Override
    public List<String> visit(Multiplication multiplication) {
        VariableListVisitor variableListVisitor = this;
        return new ArrayList<>() {{
            addAll(multiplication.getLeft().accept(variableListVisitor));
            addAll(multiplication.getRight().accept(variableListVisitor));
        }};
    }

    @Override
    public List<String> visit(Subtraction subtraction) {
        VariableListVisitor variableListVisitor = this;
        return new ArrayList<>() {{
            addAll(subtraction.getLeft().accept(variableListVisitor));
            addAll(subtraction.getRight().accept(variableListVisitor));
        }};
    }

    @Override
    public List<String> visit(Number number) {
        return new ArrayList<>();
    }

    @Override
    public List<String> visit(Absolute absolute) {
        VariableListVisitor variableListVisitor = this;
        return new ArrayList<>() {{
            addAll(absolute.getBase().accept(variableListVisitor));
        }};
    }

    @Override
    public List<String> visit(Power power) {
        VariableListVisitor variableListVisitor = this;
        return new ArrayList<>() {{
            addAll(power.getBase().accept(variableListVisitor));
            addAll(power.getExponent().accept(variableListVisitor));
        }};
    }

    @Override
    public List<String> visit(SquareRoot squareRoot) {
        VariableListVisitor variableListVisitor = this;
        return new ArrayList<>() {{
            addAll(squareRoot.getRadical().accept(variableListVisitor));
        }};
    }

    @Override
    public List<String> visit(Variable variable) {
        return new ArrayList<>() {{
            add(variable.getName());
        }};
    }
}
