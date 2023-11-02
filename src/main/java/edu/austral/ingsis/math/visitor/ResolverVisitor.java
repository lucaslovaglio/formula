package edu.austral.ingsis.math.visitor;

public class ResolverVisitor implements Visitor{
    private final VariableContext variableContext;

    public ResolverVisitor(VariableContext variableContext) {
        this.variableContext = variableContext;
    }

    public ResolverVisitor() {
        this.variableContext = new VariableContext();
    }

    public VariableContext getVariableContext() {
        return variableContext;
    }

    @Override
    public Double visit(Addition addition) {
        return (double) addition.getLeft().accept(this) + (double) addition.getRight().accept(this);
    }

    @Override
    public Double visit(Division division) {
        return (double) division.getNumeral().accept(this) / (double) division.getDenominator().accept(this);
    }

    @Override
    public Double visit(Multiplication multiplication) {
        return (double) multiplication.getLeft().accept(this) * (double) multiplication.getRight().accept(this);
    }

    @Override
    public Double visit(Subtraction subtraction) {
        return (double) subtraction.getLeft().accept(this) - (double) subtraction.getRight().accept(this);
    }

    @Override
    public Double visit(Number number) {
        return number.getValue();
    }

    @Override
    public Double visit(Absolute absolute) {
        return Math.abs((double) absolute.getBase().accept(this));
    }

    @Override
    public Double visit(Power power) {
        return Math.pow((double) power.getBase().accept(this), (double) power.getExponent().accept(this));
    }

    @Override
    public Double visit(SquareRoot squareRoot) {
        return Math.sqrt((double) squareRoot.getRadical().accept(this));
    }

    @Override
    public Double visit(Variable variable) {
        String name = variable.getName();
        Double value = variableContext.getVariable(name);
        if (value != null) {
            return value;
        } else {
            throw new IllegalArgumentException("Variable no asignada: " + name);
        }
    }
}
