package edu.austral.ingsis.math.visitor;

import edu.austral.ingsis.math.visitor.Visitor;

public interface Function {

    <T> T accept(Visitor<T> visitor);
}
