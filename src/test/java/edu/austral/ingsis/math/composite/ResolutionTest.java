package edu.austral.ingsis.math.composite;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class ResolutionTest {

    /**
     * Case 1 + 6
     */
    @Test
    public void shouldResolveSimpleFunction1() {
        Number number1 = new Number(1);
        Number number2 = new Number(6);
        Addition addition = new Addition(number1, number2);
        final Double result = addition.solve();

        assertThat(result, equalTo(7d));
    }

    /**
     * Case 12 / 2
     */
    @Test
    public void shouldResolveSimpleFunction2() {
        Number number1 = new Number(12);
        Number number2 = new Number(2);
        Division division = new Division(number1, number2);
        final Double result = division.solve();

        assertThat(result, equalTo(6d));
    }

    /**
     * Case (9 / 2) * 3
     */
    @Test
    public void shouldResolveSimpleFunction3() {
        Number number1 = new Number(9);
        Number number2 = new Number(2);
        Division division = new Division(number1, number2);
        Number number3 = new Number(3);
        Multiplication multiplication = new Multiplication(division, number3);
        final Double result = multiplication.solve();

        assertThat(result, equalTo(13.5d));
    }

    /**
     * Case (27 / 6) ^ 2
     */
    @Test
    public void shouldResolveSimpleFunction4() {
        Number number1 = new Number(27);
        Number number2 = new Number(6);
        Division division = new Division(number1, number2);
        Number number3 = new Number(2);
        Power power = new Power(division, number3);
        final Double result = power.solve();

        assertThat(result, equalTo(20.25d));
    }

    /**
     * Case 36 ^ (1/2)
     */
    @Test
    public void shouldResolveSimpleFunction5() {
        Number number1 = new Number(36);
        Number number2 = new Number(2);
        Number number3 = new Number(1);
        Division division = new Division(number3, number2);
        Power power = new Power(number1, division);
        final Double result = power.solve();

        assertThat(result, equalTo(6d));
    }

    /**
     * Case |136|
     */
    @Test
    public void shouldResolveSimpleFunction6() {
        Number number1 = new Number(136);
        Absolute absolute = new Absolute(number1);
        final Double result = absolute.solve();

        assertThat(result, equalTo(136d));
    }

    /**
     * Case |-136|
     */
    @Test
    public void shouldResolveSimpleFunction7() {
        Number number1 = new Number(-136);
        Absolute absolute = new Absolute(number1);
        final Double result = absolute.solve();

        assertThat(result, equalTo(136d));
    }

    /**
     * Case (5 - 5) * 8
     */
    @Test
    public void shouldResolveSimpleFunction8() {
        Number number1 = new Number(5);
        Number number2 = new Number(5);
        Subtraction subtraction = new Subtraction(number1, number2);
        Number number3 = new Number(8);
        Multiplication multiplication = new Multiplication(subtraction, number3);
        final Double result = multiplication.solve();

        assertThat(result, equalTo(0d));
    }
}
