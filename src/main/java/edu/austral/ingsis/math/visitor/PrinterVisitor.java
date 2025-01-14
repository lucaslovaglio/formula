package edu.austral.ingsis.math.visitor;

public class PrinterVisitor implements Visitor<String> {

    private String formatNumber(double number) {
        if(number% 1 == 0) {
            return String.valueOf((int) number);
        }
        return String.valueOf(number);
    }

    private String formatFunction(Function function) {
        return switch (function) {
            case OneArgumentFunction oneArgumentFunction -> oneArgumentFunction.accept(this);
            default -> "(" + function.accept(this) + ")";
        };
    }


    @Override
    public String visit(Absolute absolute) {
        return "|" + formatFunction(absolute.getBase()) + "|";
    }

    @Override
    public String visit(Addition addition) {
        return formatFunction(addition.getLeft()) + " + " + formatFunction(addition.getRight());
    }

    @Override
    public String visit(Division division) {
        return  formatFunction(division.getNumeral()) + " / " + formatFunction(division.getDenominator());
    }

    @Override
    public String visit(Multiplication multiplication) {
        return formatFunction(multiplication.getLeft()) + " * " + formatFunction(multiplication.getRight());
    }

    @Override
    public String visit(Subtraction subtraction) {
        return formatFunction(subtraction.getLeft()) + " - " + formatFunction(subtraction.getRight());
    }

    @Override
    public String visit(Number number) {
        return formatNumber(number.getValue());
    }

    @Override
    public String visit(Power power) {
        return formatFunction(power.getBase()) + " ^ " + formatFunction(power.getExponent());
    }

    @Override
    public String visit(SquareRoot squareRoot) {
        return "√" + formatFunction(squareRoot.getRadical());
    }

    @Override
    public String visit(Variable variable) {
        return variable.getName();
    }
}
