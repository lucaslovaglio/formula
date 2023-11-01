package edu.austral.ingsis.math.visitor;

import edu.austral.ingsis.math.visitor.*;
import edu.austral.ingsis.math.visitor.Number;

public class PrinterVisitor implements Visitor<String> {

    private String formatNumber(double number) {
        if(number% 1 == 0) {
            return String.valueOf((int) number);
        }
        return String.valueOf(number);
    }

    private String formatFunction(Function function) {
        if (!(function instanceof OneArgumentFunction)) {
            return "(" + function.accept(this) + ")";
        }
        return function.accept(this);
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
    public String visit(Subtract subtract) {
        return formatFunction(subtract.getLeft()) + " - " + formatFunction(subtract.getRight());
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
