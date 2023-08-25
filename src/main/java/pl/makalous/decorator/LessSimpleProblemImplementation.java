package pl.makalous.decorator;

import org.springframework.beans.factory.annotation.Autowired;

public class LessSimpleProblemImplementation extends DecoratorForTheProblem {
    @Autowired
    LessSimpleProblemImplementation(SimpleProblem simpleProblem) {
        super(simpleProblem);
    }

    @Override
    public boolean solvable() {
        return super.solvable();
    }

    @Override
    public int cost() {
        return super.cost() + 30;
    }
}
