package edu.austral.ingsis.math.visitor;


import edu.austral.ingsis.math.visitor.*;
import edu.austral.ingsis.math.visitor.Number;
import edu.austral.ingsis.math.visitor.PrinterVisitor;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class VisitorPrintTest {

    /**
     * Case 1 + 6
     */
    @Test
    public void shouldPrintFunction1() {
        Number number1 = new Number(1);
        Number number2 = new Number(6);
        PrinterVisitor printerVisitor = new PrinterVisitor();
        Addition addition = new Addition(number1, number2);
        final String expected = "1 + 6";
        final String result = addition.accept(printerVisitor);

        assertThat(result, equalTo(expected));
    }

    /**
     * Case 12 / 2
     */
    @Test
    public void shouldPrintFunction2() {
        Number number1 = new Number(12);
        Number number2 = new Number(2);
        PrinterVisitor printerVisitor = new PrinterVisitor();
        Division division = new Division(number1, number2);
        final String expected = "12 / 2";
        final String result = division.accept(printerVisitor);

        assertThat(result, equalTo(expected));
    }

    /**
     * Case (9 / 2) * 3
     */
    @Test
    public void shouldPrintFunction3() {
        Number number1 = new Number(9);
        Number number2 = new Number(2);
        Number number3 = new Number(3);
        PrinterVisitor printerVisitor = new PrinterVisitor();
        Division division = new Division(number1, number2);
        Multiplication multiplication = new Multiplication(division, number3);
        final String expected = "(9 / 2) * 3";
        final String result = multiplication.accept(printerVisitor);

        assertThat(result, equalTo(expected));
    }

    /**
     * Case (27 / 6) ^ 2
     */
    @Test
    public void shouldPrintFunction4() {
        Number number1 = new Number(27);
        Number number2 = new Number(6);
        Number number3 = new Number(2);
        PrinterVisitor printerVisitor = new PrinterVisitor();
        Division division = new Division(number1, number2);
        Power power = new Power(division, number3);
        final String expected = "(27 / 6) ^ 2";
        final String result = power.accept(printerVisitor);

        assertThat(result, equalTo(expected));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldPrintFunction6() {
        Number number = new Number(8);
        Variable variable = new Variable("value");
        PrinterVisitor printerVisitor = new PrinterVisitor();
        Absolute absolute = new Absolute(variable);
        Subtract subtract = new Subtract(absolute, number);
        final String expected = "|value| - 8";
        final String result = subtract.accept(printerVisitor);

        assertThat(result, equalTo(expected));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldPrintFunction7() {
        Number number = new Number(8);
        Variable variable = new Variable("value");
        PrinterVisitor printerVisitor = new PrinterVisitor();
        Absolute absolute = new Absolute(variable);
        Subtract subtract = new Subtract(absolute, number);
        final String expected = "|value| - 8";
        final String result = subtract.accept(printerVisitor);

        assertThat(result, equalTo(expected));
    }

    /**
     * Case (5 - i) * 8
     */
    @Test
    public void shouldPrintFunction8() {
        Number number1 = new Number(5);
        Number number2 = new Number(8);
        Variable variable = new Variable("i");
        PrinterVisitor printerVisitor = new PrinterVisitor();
        Subtract subtract = new Subtract(number1, variable);
        Multiplication multiplication = new Multiplication(subtract, number2);
        final String expected = "(5 - i) * 8";
        final String result = multiplication.accept(printerVisitor);

        assertThat(result, equalTo(expected));
    }
}
