package edu.austral.ingsis.math.visitor;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class VisitorResolutionWithVariablesTest {

    /**
     * Case 1 + x where x = 3
     */
    @Test
    public void shouldResolveFunction1() {
        Number number1 = new Number(1);
        Variable variable = new Variable("x");
        Addition addition = new Addition(number1, variable);
        VariableContext variableContext = new VariableContext();
        variableContext.setVariable("x", 3d);
        ResolverVisitor resolverVisitor = new ResolverVisitor(variableContext);
        final Double result = 4d;

        assertThat(result, equalTo(addition.accept(resolverVisitor)));
    }

    /**
     * Case 12 / div where div = 4
     */
    @Test
    public void shouldResolveFunction2() {
        Number number1 = new Number(12);
        Variable variable = new Variable("div");
        Division division = new Division(number1, variable);
        VariableContext variableContext = new VariableContext();
        variableContext.setVariable("div", 4d);
        ResolverVisitor resolverVisitor = new ResolverVisitor(variableContext);
        final Double result = 3d;

        assertThat(result, equalTo(division.accept(resolverVisitor)));
    }

    /**
     * Case (9 / x) * y where x = 3 and y = 4
     */
    @Test
    public void shouldResolveFunction3() {
        Number number1 = new Number(9);
        Variable variable1 = new Variable("x");
        Division division = new Division(number1, variable1);
        Variable variable2 = new Variable("y");
        Multiplication multiplication = new Multiplication(division, variable2);
        VariableContext variableContext = new VariableContext();
        variableContext.setVariable("x", 3d);
        variableContext.setVariable("y", 4d);
        ResolverVisitor resolverVisitor = new ResolverVisitor(variableContext);
        final Double result = 12d;

        assertThat(result, equalTo(multiplication.accept(resolverVisitor)));
    }

    /**
     * Case (27 / a) ^ b where a = 9 and b = 3
     */
    @Test
    public void shouldResolveFunction4() {
        Number number1 = new Number(27);
        Variable variable1 = new Variable("a");
        Division division = new Division(number1, variable1);
        Variable variable2 = new Variable("b");
        Power power = new Power(division, variable2);
        VariableContext variableContext = new VariableContext();
        variableContext.setVariable("a", 9d);
        variableContext.setVariable("b", 3d);
        ResolverVisitor resolverVisitor = new ResolverVisitor(variableContext);
        final Double result = 27d;

        assertThat(result, equalTo(power.accept(resolverVisitor)));
    }

    /**
     * Case z ^ (1/2) where z = 36
     */
    @Test
    public void shouldResolveFunction5() {
        Variable variable = new Variable("z");
        Number number1 = new Number(1);
        Number number2 = new Number(2);
        Division division = new Division(number1, number2);
        Power power = new Power(variable, division);
        VariableContext variableContext = new VariableContext();
        variableContext.setVariable("z", 36d);
        ResolverVisitor resolverVisitor = new ResolverVisitor(variableContext);
        final Double result = 6d;

        assertThat(result, equalTo(power.accept(resolverVisitor)));
    }

    /**
     * Case |value| - 8 where value = 8
     */
    @Test
    public void shouldResolveFunction6() {
        Number number = new Number(8);
        Variable variable = new Variable("value");
        Absolute absolute = new Absolute(variable);
        Subtract subtract = new Subtract(absolute, number);
        VariableContext variableContext = new VariableContext();
        variableContext.setVariable("value", 8d);
        ResolverVisitor resolverVisitor = new ResolverVisitor(variableContext);
        final Double result = 0d;

        assertThat(result, equalTo(subtract.accept(resolverVisitor)));
    }

    /**
     * Case |value| - 8 where value = 8
     */
    @Test
    public void shouldResolveFunction7() {
        Number number = new Number(8);
        Variable variable = new Variable("value");
        Absolute absolute = new Absolute(variable);
        Subtract subtract = new Subtract(absolute, number);
        VariableContext variableContext = new VariableContext();
        variableContext.setVariable("value", 8d);
        ResolverVisitor resolverVisitor = new ResolverVisitor(variableContext);
        final Double result = 0d;

        assertThat(result, equalTo(subtract.accept(resolverVisitor)));
    }

    /**
     * Case (5 - i) * 8 where i = 2
     */
    @Test
    public void shouldResolveFunction8() {
        Number number1 = new Number(5);
        Variable variable = new Variable("i");
        Number number2 = new Number(8);
        Subtract subtract = new Subtract(number1, variable);
        Multiplication multiplication = new Multiplication(subtract, number2);
        VariableContext variableContext = new VariableContext();
        variableContext.setVariable("i", 2d);
        ResolverVisitor resolverVisitor = new ResolverVisitor(variableContext);
        final Double result = 24d;

        assertThat(result, equalTo(multiplication.accept(resolverVisitor)));
    }
}
