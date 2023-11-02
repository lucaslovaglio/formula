package edu.austral.ingsis.math.composite;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class ListVariablesTest {

    /**
     * Case 1 + 6
     */
    @Test
    public void shouldListVariablesFunction1() {
        Number number1 = new Number(1);
        Number number2 = new Number(6);
        Addition addition = new Addition(number1, number2);
        final List<String> result = addition.getVariables();

        assertThat(result, empty());
    }

    /**
     * Case 12 / div
     */
    @Test
    public void shouldListVariablesFunction2() {
        Number number1 = new Number(12);
        Variable variable = new Variable("div");
        Division division = new Division(number1, variable);
        final List<String> result = division.getVariables();

        assertThat(result, containsInAnyOrder("div"));
    }

    /**
     * Case (9 / x) * y
     */
    @Test
    public void shouldListVariablesFunction3() {
        Number number1 = new Number(9);
        Variable variable1 = new Variable("x");
        Division division = new Division(number1, variable1);
        Variable variable2 = new Variable("y");
        Multiplication multiplication = new Multiplication(division, variable2);
        final List<String> result = multiplication.getVariables();

        assertThat(result, containsInAnyOrder("x", "y"));
    }

    /**
     * Case (27 / a) ^ b
     */
    @Test
    public void shouldListVariablesFunction4() {
        Number number1 = new Number(27);
        Variable variable1 = new Variable("a");
        Division division = new Division(number1, variable1);
        Variable variable2 = new Variable("b");
        Power power = new Power(division, variable2);
        final List<String> result = power.getVariables();

        assertThat(result, containsInAnyOrder("a", "b"));
    }

    /**
     * Case z ^ (1/2)
     */
    @Test
    public void shouldListVariablesFunction5() {
        Number number1 = new Number(1);
        Number number2 = new Number(2);
        Division division = new Division(number1, number2);
        Variable variable = new Variable("z");
        Power power = new Power(variable, division);
        final List<String> result = power.getVariables();

        assertThat(result, containsInAnyOrder("z"));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldListVariablesFunction6() {
        Variable variable = new Variable("value");
        Absolute absoluteValue = new Absolute(variable);
        Number number = new Number(8);
        Subtraction subtraction = new Subtraction(absoluteValue, number);
        final List<String> result = subtraction.getVariables();

        assertThat(result, containsInAnyOrder("value"));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldListVariablesFunction7() {
        Variable variable = new Variable("value");
        Absolute absoluteValue = new Absolute(variable);
        Number number = new Number(8);
        Subtraction subtraction = new Subtraction(absoluteValue, number);
        final List<String> result = subtraction.getVariables();

        assertThat(result, containsInAnyOrder("value"));
    }

    /**
     * Case (5 - i) * 8
     */
    @Test
    public void shouldListVariablesFunction8() {
        Number number1 = new Number(5);
        Variable variable = new Variable("i");
        Subtraction subtraction = new Subtraction(number1, variable);
        Number number2 = new Number(8);
        Multiplication multiplication = new Multiplication(subtraction, number2);
        final List<String> result = multiplication.getVariables();

        assertThat(result, containsInAnyOrder("i"));
    }
}
