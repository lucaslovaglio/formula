package edu.austral.ingsis.math.composite;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrintTest {

    /**
     * Case 1 + 6
     */
    @Test
    public void shouldPrintFunction1() {
        Number number1 = new Number(1);
        Number number2 = new Number(6);
        Addition addition = new Addition(number1, number2);
        final String expected = "1 + 6";
        final String result = addition.print();

        assertThat(result, equalTo(expected));
    }

    /**
     * Case 12 / 2
     */
    @Test
    public void shouldPrintFunction2() {
        Number number1 = new Number(12);
        Number number2 = new Number(2);
        Division division = new Division(number1, number2);
        final String expected = "12 / 2";
        final String result = division.print();

        assertThat(result, equalTo(expected));
    }

    /**
     * Case (9 / 2) * 3
     */
    @Test
    public void shouldPrintFunction3() {
        Number number1 = new Number(9);
        Number number2 = new Number(2);
        Division division = new Division(number1, number2);
        Number number3 = new Number(3);
        Multiplication multiplication = new Multiplication(division, number3);
        final String expected = "(9 / 2) * 3";
        final String result = multiplication.print();

        assertThat(result, equalTo(expected));
    }

    /**
     * Case (27 / 6) ^ 2
     */
    @Test
    public void shouldPrintFunction4() {
        Number number1 = new Number(27);
        Number number2 = new Number(6);
        Division division = new Division(number1, number2);
        Number number3 = new Number(2);
        Power power = new Power(division, number3);
        final String expected = "(27 / 6) ^ 2";
        final String result = power.print();

        assertThat(result, equalTo(expected));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldPrintFunction6() {
        Variable variable = new Variable("value");
        Number number = new Number(8);
        Absolute absoluteValue = new Absolute(variable);
        Subtraction subtraction = new Subtraction(absoluteValue, number);
        final String expected = "|value| - 8";
        final String result = subtraction.print();

        assertThat(result, equalTo(expected));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldPrintFunction7() {
        Variable variable = new Variable("value");
        Number number = new Number(8);
        Absolute absoluteValue = new Absolute(variable);
        Subtraction subtraction = new Subtraction(absoluteValue, number);
        final String expected = "|value| - 8";
        final String result = subtraction.print();

        assertThat(result, equalTo(expected));
    }

    /**
     * Case (5 - i) * 8
     */
    @Test
    public void shouldPrintFunction8() {
        Number number1 = new Number(5);
        Variable variable = new Variable("i");
        Subtraction subtraction = new Subtraction(number1, variable);
        Number number2 = new Number(8);
        Multiplication multiplication = new Multiplication(subtraction, number2);
        final String expected = "(5 - i) * 8";
        final String result = multiplication.print();

        assertThat(result, equalTo(expected));
    }
}
