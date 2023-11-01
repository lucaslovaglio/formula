package edu.austral.ingsis.math.visitor;

import edu.austral.ingsis.math.visitor.Visitor;

public interface OneArgumentFunction extends Function {

    <T> T accept(Visitor<T> visitor);
}
