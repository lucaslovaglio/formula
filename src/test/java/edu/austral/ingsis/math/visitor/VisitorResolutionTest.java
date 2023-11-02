package edu.austral.ingsis.math.visitor;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class VisitorResolutionTest {

    /**
     * Case 1 + 6
     */
    @Test
    public void shouldResolveSimpleFunction1() {
        Number number1 = new Number(1);
        Number number2 = new Number(6);
        Addition addition = new Addition(number1, number2);
        ResolverVisitor resolverVisitor = new ResolverVisitor();
        final Double result = 7d;

        assertThat(result, equalTo(addition.accept(resolverVisitor)));
    }

    /**
     * Case 12 / 2
     */
    @Test
    public void shouldResolveSimpleFunction2() {
        Number number1 = new Number(12);
        Number number2 = new Number(2);
        Division division = new Division(number1, number2);
        ResolverVisitor resolverVisitor = new ResolverVisitor();
        final Double result = 6d;

        assertThat(result, equalTo(division.accept(resolverVisitor)));
    }

    /**
     * Case (9 / 2) * 3
     */
    @Test
    public void shouldResolveSimpleFunction3() {
        Number number1 = new Number(9);
        Number number2 = new Number(2);
        Number number3 = new Number(3);
        Division division = new Division(number1, number2);
        Multiplication multiplication = new Multiplication(division, number3);
        ResolverVisitor resolverVisitor = new ResolverVisitor();
        final Double result = 13.5;

        assertThat(result, equalTo(multiplication.accept(resolverVisitor)));
    }

    /**
     * Case (27 / 6) ^ 2
     */
    @Test
    public void shouldResolveSimpleFunction4() {
        Number number1 = new Number(27);
        Number number2 = new Number(6);
        Number number3 = new Number(2);
        Division division = new Division(number1, number2);
        Power power = new Power(division, number3);
        ResolverVisitor resolverVisitor = new ResolverVisitor();
        final Double result = 20.25;

        assertThat(result, equalTo(power.accept(resolverVisitor)));
    }

    /**
     * Case 36 ^ (1/2)
     */
    @Test
    public void shouldResolveSimpleFunction5() {
        Number number1 = new Number(36);
        Number number2 = new Number(1);
        Number number3 = new Number(2);
        Division division = new Division(number2, number3);
        Power power = new Power(number1, division);
        ResolverVisitor resolverVisitor = new ResolverVisitor();
        final Double result = 6d;

        assertThat(result, equalTo(power.accept(resolverVisitor)));
    }

    /**
     * Case |136|
     */
    @Test
    public void shouldResolveSimpleFunction6() {
        Number number1 = new Number(136);
        Absolute absolute = new Absolute(number1);
        ResolverVisitor resolverVisitor = new ResolverVisitor();
        final Double result = 136d;

        assertThat(result, equalTo(absolute.accept(resolverVisitor)));
    }

    /**
     * Case |-136|
     */
    @Test
    public void shouldResolveSimpleFunction7() {
        Number number1 = new Number(-136);
        Absolute absolute = new Absolute(number1);
        ResolverVisitor resolverVisitor = new ResolverVisitor();
        final Double result = 136d;

        assertThat(result, equalTo(absolute.accept(resolverVisitor)));
    }

    /**
     * Case (5 - 5) * 8
     */
    @Test
    public void shouldResolveSimpleFunction8() {
        Number number1 = new Number(5);
        Number number2 = new Number(5);
        Number number3 = new Number(8);
        Subtract subtract = new Subtract(number1, number2);
        Multiplication multiplication = new Multiplication(subtract, number3);
        ResolverVisitor resolverVisitor = new ResolverVisitor();
        final Double result = 0d;

        assertThat(result, equalTo(multiplication.accept(resolverVisitor)));
    }
}
